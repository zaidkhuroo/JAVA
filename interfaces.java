interface ABC { //1st interface
     void prints();
     public static final int a=10; //a variable must contain  public static final kyword with it in interface
}
interface ABCD { //2nd interface
    void disp();
    public static final int a=10; //a variable must contain  public static final kyword with it in interface
}

class A implements ABC { //implementing both the interfaces in this regular class to achive multiple inheritance.
    
    public void prints() { //we can't implement method of an interface without using public keyword with regular method. we also achieve method overriding with this as the method name and its arguments in every sub classes are same.
    
        System.out.println("I am in class A");
    }
    public void disp() { //we can't implement method of an interface without using public keyword with regular method. we also achieve method overriding with this as the method name and its arguments in every sub classes are same.
    
        System.out.println("I am in class A");
    }
}


public class interfaces {
    public static void main(String args[]) {
        A obj = new A(); //we can't create object of interface methods, we can only create objects of regular class's methods.
        obj.prints();
        obj.disp();
    }
}
