import java.util.Scanner;

class calcul {
    public int add(int i, int j) // creating first method by passing 3 paramaters inside it
    {
        return i + j;

    }

    public int add(int i, int k, int j) // creating first method by passing 3 paramaters inside it
    {
        return i + k + j;

    }
}
    public class sum {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter any two numbers :");
            int i = s.nextInt();
            int j = s.nextInt();
            int k = s.nextInt();
            calcul ob1 = new calcul();
            int sum = ob1.add(i,k);
            System.out.println(sum);
        }
    }
