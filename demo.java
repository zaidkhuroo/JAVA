class calc { // new class
    public void solo() { // creating method
        System.out.println("playing"); // elements in method
    }

    public String videoMaking() { // creating another method of type string {
        return "good job"; // returning the string value.
    }
}

public class demo { // main class of the program 

    public static void main(String args[]) // man method of the program
    {
        calc object1 = new calc(); // creating a new object of class calc
        object1.solo(); // calling method with the object

        String str = object1.videoMaking();// calling second method with the same object and also making a variable
                                           // string print the result, otherwise it can't display the same.
        System.out.println(str); // this will print the return of method video making with the help of object
                                 // accessed by string.
    }
}
