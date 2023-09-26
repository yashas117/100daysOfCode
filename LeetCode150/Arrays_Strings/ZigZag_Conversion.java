package LeetCode150.Arrays_Strings;

public class ZigZag_Conversion {

    public static void main(String args[]){

        String s = "P";
        int n = 1;
        System.out.println(convert(s,n));
    }
    
    public static String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }
        
        StringBuilder b = new StringBuilder("");
        int n = 0;
        boolean c;
        int i=0;
        while(n < numRows){
            c = true;
            while(i<s.length()){
                b.append(s.charAt(i));
                if(n == 0 || n == numRows-1){
                    i += (numRows-1)*2;
                }else{
                    if(c){
                        c=false;
                        i += ((numRows-1)-n)*2;
                    }else{
                        c=true;
                        i += n*2;
                    }
                }
            }
            n++;
            i=n;
        }
        return b.toString();
    }
}
