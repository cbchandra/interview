package questions;

class A {
    static int i = 10;

    public static void out() {
        System.out.println("A");
    }
}

class B  extends A {
    static int i = 20;

    public static void out() {
        System.out.println("B");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        A a1 = new B();

        a1.out();
        System.out.println(a1.i);
    }
}
