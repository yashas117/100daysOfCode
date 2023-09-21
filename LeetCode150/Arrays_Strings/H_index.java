package LeetCode150.Arrays_Strings;

import java.util.Arrays;

public class H_index {
    
    public static void main(String args[]){

        int arr[] = {3, 0, 6, 1, 5};
        System.out.print(hIndex(arr));
    }
    public static int hIndex(int[] citations) {
        int k = 1;
        Arrays.sort(citations);
        for(int i=citations.length-1;i>=0;i--){

            if(citations[i] >= k){
                k++;
            }
        }
        return k-1;
    }
}
