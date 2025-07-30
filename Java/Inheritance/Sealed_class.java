package Inheritance;

sealed class A extends Thread implements Cloneable permits B, C {
    //System.out.println();
}

non-sealed class B extends A {
    //System.out.println();
}

final class C extends A {
    //System.out.println();
}

class D extends B {
    // System.out.println();
}

sealed interface X permits Y {
    // System.out.println();
}

non-sealed interface Y extends X {
    // System.out.println();
}
public class Sealed_class {
    public static void main(String a[]){
        System.out.println();
    }
}
