package Data_Structures.LeetCode;

public class Rotate_Array {

    public static void main(String args[]){

        int k = 4;
        int nums[] = {1,2,3,4,5,6,7};
        rotate(nums, k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k%n;
        reverseapart(nums,0,n-1);
        reverseapart(nums,0,k-1);
        reverseapart(nums,k,n-1);
    }
    public static void reverseapart(int[] nums, int i,int j){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--; 
        }
    }
    // public void rotate(int[] nums, int k) {      // Brute Force
    //     int t;
    //     int n = nums.length;
    //     int a[] = new int[n];
    //     int r=0;
    //     k = k%n;
    //     for(int i=k;i>0;i--){
    //         a[r++] = nums[n-i];
    //     }
    //     for(int j=0;j<(n-k);j++){
    //         a[r++] = nums[j];
    //     }
    //     for(int i=0;i<n;i++){
    //         nums[i] = a[i];
    //     }
    // }
}
