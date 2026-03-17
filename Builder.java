package dsa_basic.string;

public class Builder {
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder("suraj");
        System.err.println("sb");

        //char at index 0
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(1, 'o');
        System.out.println(sb);


        sb.delete(4,5);
        System.out.println(sb);

        sb.append('m');
        System.out.println(sb);
        System.out.println(sb.length());

        //reverse using stringbuilder
        StringBuilder nsb = new StringBuilder("hello");

         for(int i=0; i<nsb.length()/2; i++){
            int front =i;
            int back =nsb.length()-1;

            char frontChar = nsb.charAt(front);
            char backChar = nsb.charAt(back);

            nsb.setCharAt(front, backChar);
            nsb.setCharAt(back, frontChar);
         }
         System.out.println(nsb);


    }
    
}
