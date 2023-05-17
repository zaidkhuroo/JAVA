public class calcrunning{
    public static void main(String args[]) {
        fullcalc object1 = new fullcalc();
        int r1 = object1.add(10, 12);
        int r2 = object1.sub(22, 12);
        int r3 = object1.mul(10, 11);
        int r4 = object1.div(10, 2);
        System.out.println("The result is: " + r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
