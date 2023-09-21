package LeetCode150.Arrays_Strings;

public class Jump_Game {

    public static void main(String args[]){

        int nums[] = {2, 3, 1, 1, 4};
        System.out.print(canJump(nums));
    }
    
    public static boolean canJump(int[] nums) {
        
        int reach = 0;
        for(int i=0;i<nums.length;i++){
            if(i > reach){
                return false;
            }
            reach = Math.max(reach , i+nums[i]);
            if(reach >= nums.length-1){
                break;
            }
        }
        return true;
    }
}
