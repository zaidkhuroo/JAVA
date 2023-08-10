//program to print threads one after each other 
class A extends Thread { // using thread with class A by using extends keyword
    public void run() { // in every thread we need to have a run method 
        for (int i = 0; i <= 100; i++) {
            System.out.println("hello");  
            try { 
                Thread.sleep(10);//by using thread.sleep() we can put thread to sleep for 10 mili seconds and by this threads will be optimized to be printed one after each other.
                //we are also using try and catch method as using thread.sleep throws exception so it will be handled precisely by try and catch blocks
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread { // replacing class with threads by extends keyword
    public void run() { // in every thread we need to have a run method
        for (int i = 0; i <= 100; i++) {
            System.out.println("boss");
            try {
                Thread.sleep(10); //by using thread.sleep() we can put thread to sleep for 10 mili seconds and by this threads will be optimized to be printed one after each other
                //we are also using try and catch method as using thread.sleep throws exception so it will be handled precisely by try and catch blocks
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadprior {
    public static void main(String[] args) { // main method
        A obj1 = new A();
        B obj2 = new B();
        obj1.start(); // when calling an object with start method will invoke run method
        try {
            Thread.sleep(2); //by using thread.sleep() in b/w of calling threads, we can put one call to sleep for 2ms and by this threads will be more optimized to be run one after each other.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start(); // when calling an object with start method will invoke run method
    }
}
