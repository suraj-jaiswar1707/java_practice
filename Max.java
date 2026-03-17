package dsa_basic;
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		
		System.out.println("Enter elemtns of aaray");
		
		for(int i =0; i<num.length; i++){
		    num[i] =sc.nextInt();
		}
		
	int max =num[0];
		
		for(int i=1; i<num.length; i++){
		    if(num[i] > max ){
		        max = num[i];
		       
		        
		    }
		}
		
		System.out.println("maximun number is :" + max);
		
		
		
		
		
	}
    
}
