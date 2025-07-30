class Human{
    private int age;
    private String name;

    public Human(){       // Default Constructor
        age = 12;
        name = "Jithu";
    }

    public Human(int age, String name){ // Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public Human(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }  
}



public class Constructors {
    public static void main(String a[]){
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obj1 = new Human(18, "Krish");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        
        Human obj2 = new Human("Kishor");
        System.out.println(obj2.getName() + " : " + obj2.getAge());
        obj.setAge(21);
        obj.setName("Jithu");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
