package LeetCode150.Arrays_Strings;

public class Index_Of_FirstOccurrence {

    public static int strStr(String haystack, String needle) {
        
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && needle.charAt(j) == haystack.charAt(i+j)){
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
    
}
