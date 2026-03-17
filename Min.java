package dsa_basic;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int size = sc.nextInt();

        int[] num = new int[size];

        System.out.println("Enter the elements of array: ");
        for(int i =0; i<num.length; i++){
            num[i] = sc.nextInt();
;        }

       int min = Integer.MAX_VALUE;

       for(int i = 1; i<num.length; i++){
             if(num[i] < min){
                min = num[i];

             }
       }
         System.out.println("Minimum element in the array is: " + min);

    }
}
