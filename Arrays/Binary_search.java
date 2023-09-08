package Data_Structures.Arrays;

public class Binary_search {

    public static int binarysearch(int[] num, int f){

        int st = 0;              //start pointer
        int en = num.length-1;   //end pointer
        while(st <= en){
            int mid = (st+en)/2;
            if(num[mid] == f){
                return mid;    
            }
            else if(num[mid] < f){
                st = mid + 1;
            }
            else{
                en = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){

        int numbers[] = {2,4,9,13,7,3,10,11,19};
        int find = 10;
        
        int index = binarysearch(numbers,find);
        System.out.println("Number is found at index :"+index);
    }
}
