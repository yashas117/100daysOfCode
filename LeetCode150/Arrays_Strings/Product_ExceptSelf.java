package LeetCode150.Arrays_Strings;

public class Product_ExceptSelf {

    public static void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5};

        int n[] = productExceptSelf(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    
    public static int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;

        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[i] = prefix;
            prefix = prefix*nums[i];
        }
        for(int i=n-1;i>=0;i--){
            result[i] = result[i] * suffix;
            suffix = suffix*nums[i];
        }
        return result;
    }
}
