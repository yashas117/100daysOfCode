package Data_Structures.Arrays;

class Next_Permutation {

    public static void main(String args[]){

        int a[] = {1,2,3,4};
        nextPermutation(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void nextPermutation(int[] nums) {

        if(nums.length<=1){
            return;
        }
        int i = nums.length-2;                    
        while(i >= 0 && nums[i] >= nums[i+1]){   // Find the break point
            i--;
        }
        if(i >= 0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){          // Swap with next minimum element
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);       //Reverse the array from the break point
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j){

        while(i < j){
            swap(nums, i++, j--);
        }
    }
}
