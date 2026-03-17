package dsa_basic;
import java.util.*;

public class Question {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
         
        //input
        for(int i=0; i<rows; i++){
          for(int j=0; j<cols;j++){
            arr[i][j] = sc.nextInt();
          }
        }

        int x = sc.nextInt();

       for(int i=0; i<rows; i++){
          for(int j=0; j<cols;j++){
               if(arr[i][j] == x){
               System.err.println("x found at locations " + i + ","+ j);
               }
            
          }
          // System.out.println();
        }

     }
}
