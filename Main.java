public class Main {

    public static void printName(String name){
        System.out.println("your name is : " + name);
    }
    public static void main(String[] args) {

        // int[][] arr = new int[3][3];
        // arr[0][0] = 1;
        // arr[0][1] = 2;  
        // arr[0][2] = 3;

        // arr[1][0] = 4;  
        // arr[1][1] = 5;
        // arr[1][2] = 6;

        // arr[2][0] = 7;
        // arr[2][1] = 8;
        // arr[2][2] = 9;
        // System.out.println(arr[0][0]);

    //     int num = 100;

    //     do{
    //         System.out.println(num);
    //         num = num-1;
    //     }while(num >= 1);


      int i = 0;
      while (true) { 
        if(i  == 3){
            i++;
            continue;
        }
          System.out.println(i);
          i++;
          if(i>5){
                break;
          }

      }

      printJava();
      printJava();
      printJava();
      

      printName("Suraj");
        printSum(10, 20);
      

    }

    public static void printJava(){
        System.out.println("java");
    }

    public static void printSum(int a, int b){
        int sum = a+b;
        System.out.println("the sum is : " + sum);
    }
}
