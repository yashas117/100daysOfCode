package LeetCode150.Arrays_Strings;

public class Valid_Palindrome {
    
    public boolean isPalindrome(String s) {

        if(s.length() == 1){
            return true;
        }
        StringBuilder st = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int c = (int)s.charAt(i);
            if((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >= 48 && c <= 57)){
                st.append(s.charAt(i));
            }
        }
        s = (st.toString()).toLowerCase();
        int a=0;
        int b=s.length()-1;
        while(a <= b){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }
            a++;b--;
        }
        return true;
    }
}
