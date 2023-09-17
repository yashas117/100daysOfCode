package Data_Structures.LeetCode;

import java.util.Arrays;

public class Remove_Element {
    
    public int removeElement(int[] nums, int val) {
        
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                nums[i] = Integer.MAX_VALUE;
                n--;
            }
        }
        Arrays.sort(nums);
        return n;
    }
}
