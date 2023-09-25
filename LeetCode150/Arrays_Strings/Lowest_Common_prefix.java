package LeetCode150.Arrays_Strings;

import java.util.Arrays;

public class Lowest_Common_prefix {

    public static void main(String args[]){

        String strs[] = {"flying", "flight", "flew"};

        System.out.println(longestCommonPrefix(strs));
    }
    
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int i=0;
        StringBuilder s = new StringBuilder("");
        
        while(i < a.length() && i < b.length()){
            if(a.charAt(i) == b.charAt(i)){
                s.append(a.charAt(i));
                i++;
            }else{
                break;
            }
        }

        return s.toString();
    }
}
