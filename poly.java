// program to demonstrate polymorphisim
class A {
    void show() {
        System.out.println("in A");
    }
} 

class B extends A {
    void show() {
        System.out.println("in B");
    }
}

class C extends B {
    void show() {
        System.out.println("in C");
    }
}

public class poly {
    public static void main(String args[]) {
        A obj = new A(); // creating object
        obj.show(); // calling method

        obj = new B(); // here we are assigning a new object to the old variable and thus calling the
                       // show method of B
        obj.show();

        obj = new C(); // here we are assigning a new object to the old variable and thus calling the
                       // show method of C
        obj.show();
    }
}

// OUTPUT:
// in A
// in B
// in C
