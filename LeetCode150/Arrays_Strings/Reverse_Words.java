package LeetCode150.Arrays_Strings;

public class Reverse_Words {
    
    public static void main(String args[]){

        String s = "Hello world";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        
        s = s.trim();
        StringBuilder b = new StringBuilder("");
        int len = s.length()-1;
        int en=0;
        int temp=0;
        while(len>=0){
            if(s.charAt(len) != ' ' && temp==0){
                en = len;
                temp=1;
            }
            if(s.charAt(len)==' ' && temp==1){
                b.append(s.substring(len+1,en+1));
                b.append(' ');
                temp=0;
            }
            len--;
        }
        b.append(s.substring(len+1,en+1));
        return b.toString();
    }
}
