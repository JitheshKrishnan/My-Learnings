package Inheritance;

// class Alien{
//     private final int id;
//     private final String name;

//     public Alien(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Alien [id=" + id + ", name=" + name + "]";
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }
// }

// Instead of the above class which is used only for storage of data we can use a Record class which is implemented as follows:

record Alien (int id, String name){
    static int num;

    public Alien{
        if(id==0){
            throw new IllegalArgumentException("id cannot be zero");
        }
    }

    public void show(){

    }
}

public class Record_class {
    public static void main(String a[]){
        Alien a1 = new Alien(1, "Jithu");
        Alien a2 = new Alien(1, "Jithu");
        System.out.println(a1.toString());
        System.out.println(a2.equals(a1));

    }
}
