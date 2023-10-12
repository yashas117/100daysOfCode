package LeetCode150.Hashmap;

public class Anagram {
    
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        int[] f = new int[26];
        for(int i=0;i < s.length(); i++){
            f[s.charAt(i) - 'a']++;
            f[t.charAt(i) - 'a']--;
        }
        for(int i=0; i < 26;i++){
            if(f[i] != 0){
                return false;
            }
        }
        return true;
    }
}
