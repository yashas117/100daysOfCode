package LeetCode150.Hashmap;

import java.util.*;

public class Group_Anagrams {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortword = new String(ch);

            if(!map.containsKey(sortword)){
                map.put(sortword, new ArrayList<>());
            }

            map.get(sortword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
