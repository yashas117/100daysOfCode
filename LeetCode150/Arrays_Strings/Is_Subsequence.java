package LeetCode150.Arrays_Strings;

public class Is_Subsequence {
    
    public static boolean isSubsequence(String s, String t) {
        
        if(s.length() ==0){
            return true;
        }
        int k=0;
        for(int i=0;i<t.length();i++){

            if(s.charAt(k) == t.charAt(i)){
                k++;
            }
            if(k == s.length()){
                return true;
            }
        }
        return false;
    }
}
