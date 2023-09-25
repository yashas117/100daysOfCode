package LeetCode150.Arrays_Strings;

public class Length_of_LastWord {

    public static void main(String args[]){

        String s = "Hello world";
        System.out.println(lengthOfLastWord(s));
    }
    
    public static int lengthOfLastWord(String s) {

        int c=0;
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i) != ' '){
                c++;
            }
            if(s.charAt(i) == ' ' && c>0){
                break;
            }
        }
        return c;
    }
}
