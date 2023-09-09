package Data_Structures.Arrays;

public class Search_In_SortedMatrix {

    public static boolean search(int matrix[][], int key){

        int row = 0;
        int col = matrix[0].length-1;
        
        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == key){
                System.out.println("Search Found");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Search Unsuccessful");
        return false;
    }
    
    public static void main(String args[]){

        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 38, 50},
                          {35, 40, 41, 55}};
        
        int key = 35;
        search(matrix, key);

    }
}
