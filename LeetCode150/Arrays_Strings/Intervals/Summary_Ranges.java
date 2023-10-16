package LeetCode150.Intervals;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    
    public static List<String> summaryRanges(int[] nums) {
        
        List<String> lis = new ArrayList<>();
        int s;
        for(int i=0;i<nums.length;i++){
            s = nums[i];
            while(i<nums.length-1 && (nums[i]+1) == nums[i+1]){
                i++;
            }
            if(s != nums[i]){
                lis.add(""+s+"->"+nums[i]);
            }else{
                lis.add(""+s);
            }
        }
        return lis;
    }
}
