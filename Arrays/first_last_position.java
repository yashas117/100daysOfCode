package Data_Structures.Arrays;

public class first_last_position {

        public static void main(String args[]) {
            
            int[] nums = {1,1,3,4,4,5,5,5,6,7,7};
            int target = 5;
           
            int first = startIndex(nums, target);
            int end = endIndex(nums, target);

            System.out.println(first+"-"+end);
        }
    
        public static int startIndex(int[] nums, int target){
            int index = -1;
    
            int st = 0;
            int en = nums.length-1;
            
            while(st <= en){
                int mid = st + (en-st)/2;
                if(nums[mid] >= target){
                    en = mid-1;
                }else{
                    st = mid+1;
                }
                if(nums[mid] == target){
                    index = mid;
                }
            }
            return index;
        }
    
        public static int endIndex(int[] nums, int target){
            int index = -1;
    
            int st = 0;
            int en = nums.length-1;
            
            while(st <= en){
                int mid = st + (en-st)/2;
                if(nums[mid] <= target){
                    st = mid+1;
                }else{
                    en = mid-1;
                }
                if(nums[mid] == target){
                    index = mid;
                }
            }
            return index;
        }
}
