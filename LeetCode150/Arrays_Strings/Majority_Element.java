package Data_Structures.LeetCode;

public class Majority_Element {

    public static void main(String args[]){

        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    
    public static int majorityElement(int[] nums) {
        
        // Arrays.sort(nums);
        // int n = nums.length;             //Method 1 --- Sorting
        // return nums[n/2];
        int c=0,n=0;
        for(int num : nums){                 //Method 2 -- Voting Algorithm
            if(c == 0){
                n = num;
            }
            if(num == n){
                c++;
            }else{
                c--;
            }
        }
        return n;
        // int n = nums.length;                                  // Method 3 --- HashMap
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i=0;i<n;i++){
        //     map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        // }

        // n = n/2;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if(entry.getValue() > n){
        //         return entry.getKey();
        //     }
        // }
        // return 0;
    }
}
