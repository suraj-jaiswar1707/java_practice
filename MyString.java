package dsa_basic.string;
public class MyString {
    public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);

      // System.out.println("enter your name");
      //   String name = sc.nextLine();
      //   System.out.println("your name is : " +name);


        // String name = "Suraj";
        // String lastName = "Jaiswar";
        // String  fullName = name + " "  + lastName;
        // System.out.println(fullName);
         

        // System.out.println(fullName.length());


        //charAt
        // for(int i =0; i<fullName.length(); i++){
        //   System.out.println(fullName.charAt(i));
        // }

        //compare
        String name1 = "suraj";
        String name2 = "jaiswar";

       if(name1.compareTo(name1) == 0){
        System.out.println("both are same");
       }
       else{
        System.out.println("both are different");   
       }

       if(new String("tony") == new String("tony")){
        System.out.println("both are same");
       }
       else{
        System.out.println("both are different");
       }

      //substring
      String sentence = "My name is Suraj Jaiswar";
      String onlyname = sentence.substring(11,16);
      System.out.println(onlyname);


    }
}
