package Data_Structures.Arrays;

public class Linear_search {

    public static int linearsearch(int[] num, int f){
        
        for(int i=0;i<num.length;i++){
            if(f == num[i]){
                return i;   // if search element is found ---> returns index
            }
        }
        return -1;          //returns -1 if not found
    }
    
    public static void main(String args[]){

        int numbers[] = {2,4,9,13,7,3,10,11,19};
        int find = 10;
        
        int index = linearsearch(numbers,find);
        System.out.println("Number is found at index :"+index);
    }
}
