class A {
    public A() {
        System.out.println("Constructor of A");
    }
}

// Class B extends A
class B extends A {
    public B() {
        super(); // calls constructor of A
        System.out.println("Constructor of B");
    }
}

// Class C extends B
class C extends B {
    public C() {
        super(); // calls constructor of B (which in turn calls A)
        System.out.println("Constructor of C");
    }
}

public class qes8 {
    public static void main(String[] args) {
        // Creating object of class C
        C objC = new C();
    }
}
