abstract class bmw { //making an abstract class 
    int tyres;
    abstract void vehicle(); //making abstract method,it doesn't have body and by abstract method we mean that we can't provide the method deinition of the abstract method in the abstract class. also there can be an abstract class but not an abstract method in the same class
}

class audi extends bmw { //inheriting class from the abstract class bmw, with the help of this regular class, we can implement the abstract methods in this inherited class, we also achieve method overriding with this as the method name and its arguments in every sub classes are same.
    int tyres = 4; //implementing the value to the abstract variable. 
 
    void vehicle() { //implementing abstract method
        System.out.println("i am audi");
    }
}

class ferrari extends bmw {
    int tyres = 6;

    void vehicle() { //vehicle method
        System.out.println("i am ferrari");
    }
}

public class abstractclass {
    public static void main(String args[]) {
        ferrari obj1 = new ferrari(); //we can't create object of abstract methods, we can only create objects of regular class's methods.
        obj1.vehicle();
        audi obj2 = new audi(); //we can't create object of abstract methods, we can only create objects of regular class's methods.
        obj2.vehicle();
    }
}
