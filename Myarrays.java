package dsa_basic;
import java.util.Scanner;
public class Myarrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();


        int[] numbers = new int[size];
          
            System.out.println("Enter the elements of the array");
        for(int i =0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search");
         int target = sc.nextInt();

         int check = -1;

        for(int i =0; i<numbers.length; i++){
          if(numbers[i] == target){
            check = i;
            break;
        
          }
           
        }
        if(check == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: " + check);

    }
}
}
