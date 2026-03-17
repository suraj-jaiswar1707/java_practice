package dsa_basic;
import java.util.Scanner;
public class RevArray {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");  
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
                }

        // System.out.println("Reversed array:");
        // for(int i=arr.length-1; i>=0; i--){
        //     System.out.println(arr[i] + "");
        // }

         for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
         }
        //using two pointer approach
         int start =0;
         int end = arr.length-1;
         while(start < end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
         }
            System.out.println("\nReversed array:");
             for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
         }

     } 
}
