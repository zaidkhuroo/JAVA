import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {

       Scanner s= new Scanner(System.in);
       System.out.println("Enter a number");
        int num = s.nextInt();
        int factorial = 1;
        int i=1;
       
        while (i <= num) {
            // factorial = factorial * i;
            factorial *= i;
            i++;
        }

        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
