class Student
{
    int rollno;
    String name;
    int marks;
}

public class Array_of_Obj {
    public static void main(String a[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "JK";
        s1.marks = 11;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "NK";
        s2.marks = 27;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "AM";
        s3.marks = 23;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        System.out.println("Enhanced for loop"); // Enhanced for loop
        for(Student n : students){
            System.out.println(n.name+" : "+n.marks);
        }
    }
}
