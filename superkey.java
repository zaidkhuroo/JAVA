
class A { 
    int a = 10; //instance variable declared in super class and outside the method.
}

class B extends A //extending the subclass B with parent class A.
{
    int a = 20; //instance variable of sub class.  

    void show(int a) //method to print the output also has local variable in its parameter.
     { 
        System.out.println(a); //prints the value of local variable of the method ehich is in its parameter.
        System.out.println(this.a);// //this refers to the value of instance variable of current class.
        System.out.println(super.a); // //super refers to the value of instance variable of parent class.
    }
}

public class superkey //main class 
 { 
    public static void main(String args[])// main method of the program.
    {
        B ob1 = new B(); //making object of sub class.
        ob1.show(20); // calling method in class B and passing 20 in its paramater.
    }
}
