package Data_Structures.LeetCode;

public class Merge_sorted_Array {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for(int i =0;i<n;i++){
                nums1[i] = nums2[i];
            }
        }
        while(m!=0 && n!=0 ){
            if(nums1[m-1] > nums2[n-1]){
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
            else{
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
        while(n!=0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }    
    }
}
