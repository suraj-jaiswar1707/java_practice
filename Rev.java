package dsa_basic.string;

public class Rev {
    public static void main(String[] args) {
	    
	   String name = "suraj";
	   
	   char[] ch = name.toCharArray();
	   
	   int start =0;
	   int end =  ch.length-1;
	   
	   while(start < end){
	       char temp= ch[start];
	       ch[start] = ch[end];
	       ch[end] = temp;
	       start++;
	       end--;
	   }
	   
	   
	//    for(int i =0; i<ch.length; i++){
	//        System.out.print(ch[i]);
	//    }
	   String result = new String(ch);
	   System.out.println(result);
}
}
