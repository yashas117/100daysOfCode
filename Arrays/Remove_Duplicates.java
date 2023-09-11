package Data_Structures.Arrays;

public class Remove_Duplicates {
    
        public static int removeDuplicates(int[] nums) {
            int k =1;
            int i;
            for(i=0;i < nums.length-1; i++){
                if(nums[i] != nums[i+1]){
                    nums[k] = nums[i+1];
                    k++;
                }
            }
            return k;
        }

        public static void main(String args[]){

            int a[] = {1, 1, 2, 3, 3, 4, 5, 6, 6, 6};
            System.out.println(removeDuplicates(a));
        }
    
}
