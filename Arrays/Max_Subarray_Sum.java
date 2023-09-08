package Data_Structures.Arrays;

public class Max_Subarray_Sum {

    public static void main(String args[]){

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print("Max Subarray Sum = "+Kadanes(arr));
    }

    public static int Kadanes(int arr[]){     //Kadane's Algorithm

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }
    
    public static int Max_subarray(int arr[]){    // Prefix Method

        int prefix[] = new int[arr.length];
        int curr_sum;
        prefix[0] = arr[0];
        int max_sum = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int st = i;                       // start index

            for(int j=0;j<arr.length;j++){
                int en = j;                   // end index

                curr_sum = (st == 0) ? prefix[en] : prefix[en] - prefix[st-1];
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }
            }
        }

        return max_sum;
    }
}
