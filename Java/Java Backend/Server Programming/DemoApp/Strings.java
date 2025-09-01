public class Strings {
    public static void main(String a[]){
        String name = "Jithu";
        System.out.println("Hello " + name);
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Krish"));

        StringBuffer sb = new StringBuffer("Navin");
        sb.append(" Reddy");
        sb.insert(6, " Java");
        sb.setLength(100);
        System.out.println(sb);
    }
}
