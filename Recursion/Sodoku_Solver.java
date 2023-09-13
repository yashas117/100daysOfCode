package Recursion;

public class sudoku {

    public static void main(String args[]){

        int sudoku[][] = {{0,6,0,0,4,8,0,0,0},
                            {0,0,0,0,0,6,9,0,0},
                            {0,0,0,0,0,0,0,0,0},
                            {0,0,0,5,0,0,0,4,6},
                            {1,0,0,7,0,0,0,0,0},
                            {0,0,0,0,0,0,0,8,0},
                            {2,0,0,9,0,0,1,0,0},
                            {0,0,8,0,5,0,0,0,0},
                            {7,0,0,0,0,0,0,0,0}};
        if(sudokuSolver(sudoku,0,0)){
            System.out.println("solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("solution does not exist");
        }
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row == 9 && col == 0){
            return true;
        }
        //recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] =0 ;

            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col,int digit){
        // column
        for(int i=0;i<9;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        // Row
        for(int j=0;j<9;j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        // Grid
        int r = (row/3)*3;
        int c = (col/3)*3;
        for(int k=r;k<r+3;k++){
            for(int l=c;l<c+3;l++){
                if(sudoku[k][l] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
