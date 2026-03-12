import java.util.Scanner;   

public class MiniProject {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int myNumber = (int)(Math.random()*100);


            int userNumber = 0;
            do{
                System.out.println("Guess the Number : ");

                 userNumber = sc.nextInt();
                if(userNumber == myNumber){
                    System.out.println("WOOOH You Guessed  the Number Correctly");
                    break;
                }else if(userNumber > myNumber){
                    System.out.println("Your Number is Greater than the Actual Number");

                }else{
                    System.out.println("Your Number is Smaller than the Actual Number");
                }
            }while(userNumber >= 0);

            System.out.println("The Actual Number was : " + myNumber);
        }

        
}
