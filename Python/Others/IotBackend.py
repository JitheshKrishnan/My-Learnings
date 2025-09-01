import requests
import time
import random
import math

# Replace with your local Spring Boot server IP and port
url = "http://localhost:8080/api/sensor"
headers = {"Content-Type": "application/json", "X-API-KEY": "super-secret-token"}

# Thresholds (same as ESP32)
NORMAL_THRESHOLD = 1000
TREMOR_THRESHOLD = 4000

def generate_sensor_data():
    # Generate more realistic accelerometer data
    # Base values around 1g (16384) with variations
    base_accel = 16384
    
    # Generate acceleration values with some correlation
    ax = random.randint(-20000, 20000)
    ay = random.randint(-20000, 20000) 
    az = random.randint(10000, 22000)  # Z-axis usually closer to 1g when upright
    
    # Calculate acceleration magnitude
    accel_magnitude = int(math.sqrt(ax*ax + ay*ay + az*az))
    
    # Calculate deltaA (difference from 1g baseline)
    delta_a = abs(accel_magnitude - base_accel)
    
    # Determine status based on deltaA thresholds
    if delta_a > TREMOR_THRESHOLD:
        status = "Tremor Detected"
    elif delta_a > NORMAL_THRESHOLD:
        status = "Mild Movement"
    else:
        status = "Normal"
    
    return {
        "ax": ax,
        "ay": ay,
        "az": az,
        "accelerationMagnitude": accel_magnitude,
        "deltaA": delta_a,
        "status": status
    }

def simulate_tremor_episode():
    """Simulate a tremor episode with high deltaA values"""
    base_accel = 16384
    
    # Generate high deviation values to trigger tremor detection
    ax = random.randint(-25000, 25000)
    ay = random.randint(-25000, 25000)
    az = random.randint(5000, 30000)
    
    accel_magnitude = int(math.sqrt(ax*ax + ay*ay + az*az))
    delta_a = abs(accel_magnitude - base_accel)
    
    # Ensure it's above tremor threshold
    if delta_a < TREMOR_THRESHOLD:
        delta_a = TREMOR_THRESHOLD + random.randint(500, 2000)
        accel_magnitude = base_accel + delta_a
    
    return {
        "ax": ax,
        "ay": ay,
        "az": az,
        "accelerationMagnitude": accel_magnitude,
        "deltaA": delta_a,
        "status": "Tremor Detected"
    }

print("Starting sensor data simulation...")
print(f"Sending data to: {url}")
print("Press Ctrl+C to stop\n")

counter = 0
while True:
    try:
        # Every 10th data point, simulate a tremor episode
        if counter % 10 == 0 and counter > 0:
            data = simulate_tremor_episode()
            print("--- SIMULATING TREMOR EPISODE ---")
        else:
            data = generate_sensor_data()
        
        response = requests.post(url, json=data, headers=headers, timeout=5)
        
        if response.status_code == 200:
            print(f"✓ Sent: deltaA={data['deltaA']}, status='{data['status']}', Response: {response.text}")
        else:
            print(f"✗ Error {response.status_code}: {response.text}")
            
    except requests.exceptions.ConnectionError:
        print("✗ Connection error - Is Spring Boot server running?")
    except requests.exceptions.Timeout:
        print("✗ Request timeout")
    except Exception as e:
        print(f"✗ Error: {e}")
    
    counter += 1
    time.sleep(0.5)  # Send every 2 seconds