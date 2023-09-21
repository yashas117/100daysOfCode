package LeetCode150.Arrays_Strings;

public class Jump_Game_II {

    public static void main(String args[]){

        int arr[] = {2, 4, 3, 2, 1, 5, 2, 1};
        System.out.print("Minimum jumps = "+jump(arr));
    }
    public static int jump(int[] nums) {
        
        int jumps = 0;
        int curr = 0;
        int far = 0;
        for(int i=0;i<nums.length-1;i++){

            far = Math.max(far ,i+nums[i]);
            if(i == curr){
                curr = far;
                jumps++;
            }
        }
        return jumps;
    }
}
