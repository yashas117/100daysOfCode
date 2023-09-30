package LeetCode150.Arrays_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_3 {
    
    
    public static List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while(k>j && nums[k] == nums[k+1]) k--;
                    while(k>j && nums[j] == nums[j-1]) j++;
                }
            }
        }
        return result;
    }
}
