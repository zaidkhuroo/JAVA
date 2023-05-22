class A implements Runnable { // class A implementing Runnable
    public void run() { // in every thread we need to have a run method
        for (int i = 0; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);// by using thread.sleep() we can put thread to sleep for 10 mili seconds and by
                                 // this threads will be optimized to be printed one after each other. 
                // we are also using try and catch method as using thread.sleep throws exception
                // so it will be handled precisely by try and catch blocks
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}

class B implements Runnable { // class A implementing Runnable
    public void run() { // in every thread we need to have a run method 
        for (int i = 0; i <= 100; i++) {  
            System.out.println("boss");
            try {
                Thread.sleep(10); // by using thread.sleep() we can put thread to sleep for 10 mili seconds and by
                                  // this threads will be optimized to be printed one after each other
                // we are also using try and catch method as using thread.sleep throws exception
                // so it will be handled precisely by try and catch blocks
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    } 
}

public class usingrunnable {
    public static void main(String[] args) {
        Runnable obj1 = new A(); // here we have created refrence of the interface(runnable) with object of a
                                 // class A
        Runnable obj2 = new B(); // here we have created refrence of the interface(runnable) with object of a
                                 // class B

        Thread t1 = new Thread(obj1); // creating thread to start runnable class
        Thread t2 = new Thread(obj2); // creating thread to start runnable class
        t1.start(); // after making thread(t1) we are calling run method of runnable class by using thread with start method
        t2.start();// after making thread(t2) we are calling run method of runnable class by using thread with start method
    }
}
