// program for bubble sort on a set of given numbers
public class bubbleSort { // making class
    public static void main(String args[]) {
        int a[] = { 1, 45, 64, 23, 34, 56, 67 };
        System.out.println("Elements before sorting are"); 
        for (int i = 0; i < a.length; i++) { //using loop to print the elements of array before they're sorted
            System.out.println(a[i] + " "); //displaying the elemnts of array 
        }
        int temp; //creating a temp variable to compare the elements with each other
        for (int i = 0; i < a.length; i++) { //using this loop to count rounds
            int flag = 0; //using flag and set to zero to start counting the rounds and checking if the sorting is done over the elements
            for (int j = 0; j < a.length - 1 - i; j++) { //using a second for loop to compare adjacent elements with each other.(-i) is used to stop comparing the last elements of the array to compare when they're sorted.
                if (a[j] > a[j + 1]) { //using if statement to swap largest and smallest element with each other by using temp variable
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1; // flag will be one throughout the sorting process, until and unless the array is not sorted it will remain one and when the value of flag is 0 it will not swap elements any more.
                }
            }
            if (flag == 0) { //when the flag is 0 it will break the loop and bring control out of the loop to tun next statements of the code.
                break;
            }
        }
        System.out.println("Elements after sorting are"); //sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
