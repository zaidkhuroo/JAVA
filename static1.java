class static2 {
    static2() { //creating constructor
        System.out.println("hell");
    }

    static { //in static block when the object is created it will be called only once, no matter how many times we call an object but it will be called only once.
        System.out.println("heaven");
    }
}

public class static1 { //main class
    public static void main(String args[]) //main method
     {
        static2 s = new static2(); //object1 created
        static2 st = new static2(); //object2 created

    }
}