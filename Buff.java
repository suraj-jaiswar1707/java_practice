package dsa_basic.string;

public class Buff {
    public static void main(String[] args) {
        StringBuffer sb =  new StringBuffer("abcd");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.setLength(30);
        System.out.println(sb.capacity());
    }
}
