import java.util.Scanner;

public class month {
    public static void main(String args[]) { 
        System.out.println("Enter the month number");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i <= 12) {
            switch (i) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("FEB");
                    break;
                case 3:
                    System.out.println("MAR");
                    break;
                case 4:
                    System.out.println("APR");
                    break;
                case 5:
                    System.out.println("MAY");
                    break;
                case 6:
                    System.out.println("JUN");
                    break;
                case 7:
                    System.out.println("JUL");
                    break;
                case 8:
                    System.out.println("AUG");
                    break;
                case 9:
                    System.out.println("SEPT");
                    break;
                case 10:
                    System.out.println("OCT");
                    break;
                case 11:
                    System.out.println("NOV");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;
            }
//             if wrong input
        } else
            System.out.println("Wrong input");

    }
}
