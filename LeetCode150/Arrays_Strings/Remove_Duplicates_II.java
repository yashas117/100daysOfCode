package Data_Structures.LeetCode;

public class Remove_Duplicates_II {
    
    public int removeDuplicates(int[] nums) {

        int i,t=2;
        for(i=2; i<nums.length;i++){
            if(nums[i] != nums[t-2]){
                nums[t++] = nums[i];
            }
        }
        return t;
    }
}
