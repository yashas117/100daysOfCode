package LeetCode150.Hashmap;

import java.util.Arrays;

public class Longest_Consecutive_Subsequence {

    public static void main(String args[]){

        int arr[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
    
    public static int longestConsecutive(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max=0,c=0;
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]+1) == nums[i+1]){
                c++;
            }else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                c=0;
            } 
            max = Math.max(c, max);
        }
        return max+1;
    }
}
