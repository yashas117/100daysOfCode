package LeetCode150.Arrays_Strings.Sliding_Window;

import java.util.HashMap;

public class Longest_Substring_NonrepeatingChar {

    public static void main(String args[]){

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        int c=0;
        int i=0;int k=0;
        while(i < s.length()){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                c++;i++;
                max = Math.max(c, max);
            }
            else{
                map.remove(s.charAt(k++));
                c--;
            }
        }
        return max;
    }
}
