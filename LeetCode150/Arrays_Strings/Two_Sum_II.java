package LeetCode150.Arrays_Strings;

public class Two_Sum_II {
    
    public static int[] twoSum(int[] numbers, int target) {
        
        int i=0;
        int a[] = new int[2];
        int j=numbers.length-1;
        //int k=0;
        while(i < j){
            //k = numbers[i]+numbers[j];
            if(numbers[i]+numbers[j] == target){
                a[0] = i+1;
                a[1] = j+1;
                return a;
            }
            else if(numbers[i]+numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return a;
    }
}
