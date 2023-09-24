package LeetCode150.Arrays_Strings;

public class Roman_to_Integer {

    public static void main(String args[]){

        String s = "MMCXIV";
        System.out.println("Number - "+romanToInt(s));

    }
    
    public static int romanToInt(String s) {
        int n = 0;int c=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            switch(ch){
                case 'M':n = 1000; break;
                case 'D':n = 500; break;
                case 'C':n = 100; break;
                case 'L':n = 50; break;
                case 'X':n = 10; break;
                case 'V':n = 5; break;
                case 'I':n = 1; break;

            }
            if(n > c){
                result = result - 2*c;
            }
                c=n;

                result = result + n;
        }
        return result;
    }
}
