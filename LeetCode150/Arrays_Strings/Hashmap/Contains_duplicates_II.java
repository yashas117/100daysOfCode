package LeetCode150.Hashmap;

import java.util.HashMap;

public class Contains_duplicates_II {
    
    // abs(i-j) <= k => such that nums[i] == nums[j] => return true
    
     public static boolean containsNearbyDuplicate(int[] nums, int k) {
    
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                int a = Math.abs(map.get(nums[i])-i);
                if(a <= k){
                    return true;
                }
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
