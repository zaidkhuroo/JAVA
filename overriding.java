class A {
    public void hello() {
        System.out.println("hello");
    }
}
    class B extends A
    { 
        public void hello(){
            System.out.println("im out");
        }
    }
    

    public class overriding {
        public static void main(String args[]) {
            B obj = new B();
            obj.hello();
        }
}
