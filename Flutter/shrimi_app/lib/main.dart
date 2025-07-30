import 'package:flutter/material.dart';
import 'package:flutter_local_notifications/flutter_local_notifications.dart';
import 'package:timezone/data/latest.dart' as tz;
import 'package:timezone/timezone.dart' as tz;

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  tz.initializeTimeZones();
  tz.setLocalLocation(
      tz.getLocation('Asia/Kolkata')); // Set your preferred location

  // Create the plugin instance
  final FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin =
  FlutterLocalNotificationsPlugin();

  // Request exact alarms permission on Android
  await flutterLocalNotificationsPlugin
      .resolvePlatformSpecificImplementation<
      AndroidFlutterLocalNotificationsPlugin>()
      ?.requestExactAlarmsPermission();

  // Initialization for Android only
  const AndroidInitializationSettings initializationSettingsAndroid =
  AndroidInitializationSettings('@mipmap/ic_launcher');
  final InitializationSettings initializationSettings =
  InitializationSettings(android: initializationSettingsAndroid);
  await flutterLocalNotificationsPlugin.initialize(initializationSettings);

  runApp(MyApp(
      flutterLocalNotificationsPlugin:
      flutterLocalNotificationsPlugin)); // Pass the instance
}

class MyApp extends StatelessWidget {
  final FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin;
  // Store the plugin instance
  const MyApp(
      {Key? key, required this.flutterLocalNotificationsPlugin})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Medication Reminder',
      theme: ThemeData.dark(),
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: Text('Medication Reminder'),
          centerTitle: true,
        ),
        body: MyForm(
            flutterLocalNotificationsPlugin:
            flutterLocalNotificationsPlugin),
      ),
    );
  }
}

class MyForm extends StatefulWidget {
  final FlutterLocalNotificationsPlugin flutterLocalNotificationsPlugin;
  // Receive the plugin instance
  const MyForm(
      {Key? key, required this.flutterLocalNotificationsPlugin})
      : super(key: key);
  @override
  _MyFormState createState() => _MyFormState();
}

class _MyFormState extends State<MyForm> {
  final GlobalKey<FormState> _formKey = GlobalKey<FormState>();

  final TextEditingController _patientNameController =
  TextEditingController();
  final TextEditingController _patientPhoneController = TextEditingController();
  final TextEditingController _caretakerNameController = TextEditingController();
  final TextEditingController _caretakerNumberController =
  TextEditingController();

  final List<TextEditingController> _medicineNameControllers = [];
  final List<bool> _morningValues = [];
  final List<bool> _afternoonValues = [];
  final List<bool> _nightValues = [];
  final List<TimeOfDay?> _selectedMorningTimes = [];
  final List<TimeOfDay?> _selectedAfternoonTimes = [];
  final List<TimeOfDay?> _selectedNightTimes = [];

  @override
  void initState() {
    super.initState();
    _addMedicineField(); // Add an initial medicine field
  }

  void _addMedicineField() {
    setState(() {
      _medicineNameControllers.add(TextEditingController());
      _morningValues.add(false);
      _afternoonValues.add(false);
      _nightValues.add(false);
      _selectedMorningTimes.add(null);
      _selectedAfternoonTimes.add(null);
      _selectedNightTimes.add(null);
    });
  }

  void _deleteMedicineField(int index) {
    setState(() {
      _medicineNameControllers.removeAt(index);
      _morningValues.removeAt(index);
      _afternoonValues.removeAt(index);
      _nightValues.removeAt(index);
      _selectedMorningTimes.removeAt(index);
      _selectedAfternoonTimes.removeAt(index);
      _selectedNightTimes.removeAt(index);
    });
  }

  Widget _buildTimeSelection(int index, String label,
      List<TimeOfDay?> selectedTimes, Function selectTime) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Row(
          children: [
            Checkbox(
              value: selectedTimes[index] != null,
              onChanged: (value) => selectTime(index),
            ),
            Text(label),
          ],
        ),
        Visibility(
          visible: selectedTimes[index] != null,
          child: Row(
            children: [
              SizedBox(width: 40), // Add space for indentation
              Text('Selected Time: '),
              if (selectedTimes[index] != null)
                Text(selectedTimes[index]!.format(context)),
              IconButton(
                onPressed: selectedTimes[index] != null
                    ? () => selectTime(index)
                    : null, // Disable button if no time selected
                icon: Icon(Icons.access_time),
              ),
            ],
          ),
        ),
      ],
    );
  }

  Future<void> _selectTime(int index, String timePeriod) async {
    final TimeOfDay? pickedTime = await showTimePicker(
      context: context,
      initialTime: _selectedMorningTimes[index] ?? TimeOfDay.now(),
    );
    if (pickedTime != null) {
      setState(() {
        if (timePeriod == 'morning') {
          _selectedMorningTimes[index] = pickedTime;
        } else if (timePeriod == 'afternoon') {
          _selectedAfternoonTimes[index] = pickedTime;
        } else if (timePeriod == 'night') {
          _selectedNightTimes[index] = pickedTime;
        }
      });

      // Schedule or update notifications based on selected times
      _scheduleNotifications();
    }
  }

  void _scheduleNotifications() {
    // Cancel any existing notifications first
    widget.flutterLocalNotificationsPlugin.cancelAll();

    // Iterate through each medication and schedule notifications
    for (int index = 0; index < _medicineNameControllers.length; index++) {
      if (_selectedMorningTimes[index] != null) {
        _scheduleNotification(
          index,
          'Time to take ${_medicineNameControllers[index].text} (Morning)',
          _selectedMorningTimes[index]!,
          'morning',
        );
      }
      if (_afternoonValues[index] && _selectedAfternoonTimes[index] != null) {
        // Schedule notification only if afternoon reminder is enabled
        _scheduleNotification(
          index,
          'Time to take ${_medicineNameControllers[index].text} (Afternoon)',
          _selectedAfternoonTimes[index]!,
          'afternoon',
        );
      }
      if (_nightValues[index] && _selectedNightTimes[index] != null) {
        // Schedule notification only if night reminder is enabled
        _scheduleNotification(
          index,
          'Time to take ${_medicineNameControllers[index].text} (Night)',
          _selectedNightTimes[index]!,
          'night',
        );
      }
    }
  }

  void _scheduleNotification(
      int index, String title, TimeOfDay timeOfDay, String timePeriod) async {
    // Calculate notification time in milliseconds since epoch
    // by combining the selected time with today's date
    final now = DateTime.now();
    final today = DateTime(now.year, now.month, now.day);
    final notificationTime = tz.TZDateTime.from(
      DateTime(
        today.year,
        today.month,
        today.day,
        timeOfDay.hour,
        timeOfDay.minute,
      ),
      tz.local,
    );
    var scheduledNotificationTime = notificationTime.millisecondsSinceEpoch;

    // Check if notification time has already passed for today
    if (scheduledNotificationTime < now.millisecondsSinceEpoch) {
      // Schedule for tomorrow if time has passed
      notificationTime.add(Duration(days: 1));
      scheduledNotificationTime = notificationTime.millisecondsSinceEpoch;
    }

    // Create notification details
    final notificationDetails = NotificationDetails(
      android: AndroidNotificationDetails(
        'CHANNEL_1', // Customize channel ID
        'Channel 1 Name', // Customize channel name
        importance: Importance.max,
        priority: Priority.high,
      ),
    );

    // Schedule the notification
    await widget.flutterLocalNotificationsPlugin.zonedSchedule(
      index,
      title,
      'Tap to mark as taken',
      notificationTime,
      notificationDetails,
      uiLocalNotificationDateInterpretation:
      UILocalNotificationDateInterpretation.absoluteTime,
      androidAllowWhileIdle: true,
    );
  }

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: Form(
        key: _formKey,
        child: Column(
          children: [
            // Patient Name Field
            TextFormField(
              controller: _patientNameController,
              decoration: InputDecoration(
                labelText: 'Patient Name',
              ),
              validator: (value) {
                if (value!.isEmpty) {
                  return 'Please enter patient name';
                }
                return null;
              },
            ),
            TextFormField(
              controller: _patientPhoneController,
              decoration: InputDecoration(
                labelText: 'Patient Phone Number',
              ),
              keyboardType: TextInputType.phone,
            ),
            // Caretaker Name Field (Added)
            TextFormField(
              controller: _caretakerNameController,
              decoration: InputDecoration(
                labelText: 'Caretaker Name',
              ),
            ),
            // Caretaker Number Field
            TextFormField(
              controller: _caretakerNumberController,
              decoration: InputDecoration(
                labelText: 'Caretaker Number (Optional)',
              ),
              keyboardType: TextInputType.phone,
            ),
            // Loop through medicines
            for (int index = 0;
            index < _medicineNameControllers.length;
            index++)
              Column(
                children: [
                  Row(
                    children: [
                      Expanded(
                        child: TextFormField(
                          controller: _medicineNameControllers[index],
                          decoration: InputDecoration(
                            labelText: 'Medicine Name',
                          ),
                          validator: (value) {
                            if (value!.isEmpty) {
                              return 'Please enter a medicine name';
                            }
                            return null;
                          },
                        ),
                      ),
                      IconButton(
                        onPressed: () => _deleteMedicineField(index),
                        icon: Icon(Icons.delete),
                      ),
                    ],
                  ),
                  // Reminder Selection Checkboxes
                  Row(
                    children: [
                      Checkbox(
                        value: _morningValues[index],
                        onChanged: (value) => setState(() {
                          _morningValues[index] = value!;
                          if (value) {
                            _selectedMorningTimes[index] = null;
                          }
                        }),
                      ),
                      Text('Morning'),
                    ],
                  ),
                  _morningValues[index]
                      ? _buildTimeSelection(
                    index,
                    'Select Morning Time',
                    _selectedMorningTimes,
                        (i) => _selectTime(i, 'morning'),
                  )
                      : Container(),
                  Row(
                    children: [
                      Checkbox(
                        value: _afternoonValues[index],
                        onChanged: (value) => setState(() {
                          _afternoonValues[index] = value!;
                          if (value) {
                            _selectedAfternoonTimes[index] = null;
                          }
                        }),
                      ),
                      Text('Afternoon'),
                    ],
                  ),
                  _afternoonValues[index]
                      ? _buildTimeSelection(
                    index,
                    'Select Afternoon Time',
                    _selectedAfternoonTimes,
                        (i) => _selectTime(i, 'afternoon'),
                  )
                      : Container(),
                  Row(
                    children: [
                      Checkbox(
                        value: _nightValues[index],
                        onChanged: (value) => setState(() {
                          _nightValues[index] = value!;
                          if (value) {
                            _selectedNightTimes[index] = null;
                          }
                        }),
                      ),
                      Text('Night'),
                    ],
                  ),
                  _nightValues[index]
                      ? _buildTimeSelection(
                    index,
                    'Select Night Time',
                    _selectedNightTimes,
                        (i) => _selectTime(i, 'night'),
                  )
                      : Container(),
                ],
              ),
            ElevatedButton(
              onPressed: () => _addMedicineField(),
              child: Text('Add Medicine'),
            ),
            ElevatedButton(
              onPressed: () {
                if (_formKey.currentState!.validate()) {
                  // Save patient name, caretaker number, and medicine details (potentially to a database)
                  // Your implementation for saving data goes here
                  print('Patient Name: ${_patientNameController.text}');
                  print(
                      'Caretaker Number: ${_caretakerNumberController.text}');
                  for (int index = 0;
                  index < _medicineNameControllers.length;
                  index++) {
                    print(
                        'Medicine ${index + 1}: ${_medicineNameControllers[index].text}');
                    print('Morning Reminder: ${_morningValues[index]}');
                    print('Morning Time: ${_selectedMorningTimes[index]}');
                    print(
                        'Afternoon Reminder: ${_afternoonValues[index]}');
                    print(
                        'Afternoon Time: ${_selectedAfternoonTimes[index]}');
                    print('Night Reminder: ${_nightValues[index]}');
                    print('Night Time: ${_selectedNightTimes[index]}');
                  }
                }
              },
              child: Text('Save'),
            ),
          ],
        ),
      ),
    );
  }
}