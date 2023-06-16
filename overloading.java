
// program to use method overloading
class calcul {
    public int add(int i, int j, int k) //creating first method by passing 3 paramaters inside it
    {
        return i + j + k; 
    }

    public int add(int i, int j) //creating 2nd method by passing 2 paramaters inside it
    {
        return i + j;
    }

    public double add(double i, int j) //creating 3rd method by passing 2 paramaters inside it and the method is of double type
    {
        return i + j;
    }

}

public class overloading {
    public static void main(String args[]) //main method of the program
     {
        calcul obj1 = new calcul(); //making object of class calcul
        int sum = obj1.add(2, 8); //using sum as variable and passing values into the methods
        System.out.println(sum); //prints sum 
    }
}
