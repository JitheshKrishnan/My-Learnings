class Human{
    private int age;
    private String name;
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



public class Encapsulation {
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Jithu");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
