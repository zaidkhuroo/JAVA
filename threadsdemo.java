//program to make classes as threads, which will improve the performance of code, as threads run parallely 
class A extends Thread { //using thread with class A by using extends keyword
    public void run() { //in every thread we need to have a run method
        for (int i = 0; i <= 100; i++) { 
            System.out.println("hello");
        }
    } 
} 

class B extends Thread { //replacing class with threads by extends keyword
    public void run() { //in every thread we need to have a run method
        for (int i = 0; i <= 10; i++) {
            System.out.println("boss");
        }
    }
}

public class threadsdemo {
    public static void main(String[] args) { //main method
        A obj1 = new A(); 
        B obj2 = new B();
        obj1.start(); //when calling an object with start method will invoke run method
        obj2.start(); //when calling an object with start method will invoke run method
    }
}
