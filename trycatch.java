import java.net.SocketPermission; //library imports automatically once the exception keyword is invoked

public class trycatch {

    public static void main(String[] args) {
        int a = 8;
        int b = 0; 
        int t = 0;
 
        try { //applying try method on integer when divided with b(0)
            t = a / b;
        } catch (Exception e) { //catches the exception and prints the result
           System.out.println("cannot divide by zero"); 
        }
        System.out.println("Exception: " + t);
    }
}
