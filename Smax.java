package dsa_basic;

import java.util.Scanner;

public class Smax {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();

    int[] num = new int[size];

    System.out.println("Enter the elements of the array:");
         for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
                 }

                 int max = num[0];
                 int smax = Integer.MIN_VALUE;

                 for(int i =1; i<num.length; i++){
                    if(num[i] > max){
                        smax = max;
                        max = num[i];
                    }else if(num[i] > smax && num[i] <max) {
                        smax =num[i];
                    }
                 }
                 System.out.println("smax is : " + smax);;
    }
}
