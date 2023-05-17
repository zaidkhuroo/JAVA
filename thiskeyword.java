class abc {
    int i; // instance variable

    void numbers(int i) // passing local variable to the method. also if we will replace x with i, then
                        // it will print the default value of instance variable which is 0.
    {
        // i = x; //assigning instance variable with local variable
        // if we will set i=i then it will print the default value of instance variable
        // which is 0

        this.i = i; // with this keyword the first i will refer to the instance variable and the
                    // last i will refer to the default variable of mthod number. so wwe will get
                    // print as 10 instead of 0.
    }

    void show() {
        System.out.println(i); 
    }
}

class thiskeyword { //main class
    public static void main(String args[]) {
        abc t = new abc(); //creating objects
        t.numbers(10); //calling method with object t
        t.show(); //calling show method with object t
    }
}
