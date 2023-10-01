package LeetCode150.Arrays_Strings.Sliding_Window;

public class Min_Subaray_Sum {

    public static void main(String args[]){

        int ar[] = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(6, ar));
    }
    
    public static int minSubArrayLen(int target, int[] nums){ 
        
        int n = 0;
        int min = Integer.MAX_VALUE;
        int s = 0;
        int i = 0;
        while(n < nums.length){
            s += nums[n];
            while(s >= target){
                s = s - nums[i];
                min = Math.min(n-i+1,min);
                i++;
            }
            n++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
