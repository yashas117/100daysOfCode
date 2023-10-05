package LeetCode150.Matrix;

public class valid_sudoku {

    public boolean isValidSudoku(char[][] board) {
        return validSudoku(board , 0, 0 );
    }

    public boolean validSudoku(char[][] board ,int row, int col){
        //base case
        if(row ==board.length)return true;
        int nrow = 0; 
        int ncol = 0;
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }else{
            nrow = row+1;
            ncol =0;
        }

        if(board[row][col] != '.'){
            if(isvalid(board , row, col, board[row][col])){
                if(validSudoku(board ,nrow ,ncol)) return true;
            }
        }else{
            // '.' is there noo need to check , move to next 
            return validSudoku(board ,nrow ,ncol);
        }

        return false;
    }

    public boolean isvalid(char[][] board, int row ,int col , char number){
        //row col check
        for(int i =0;i<board.length; i++){
            //row check
            if(board[i][col] == number &&  i != row)return false;

            //col check
            if(board[row][i] == number && i!=col)return false;
        }

        //grid check
        int sr = (row/3)*3; //start of row grid (3*3)
        int sc = (col/3)*3; //start of col
        for(int i =sr ; i<sr+3 ; i++){
            for(int j =sc ; j<sc+3; j++){
                //check if board[i][j] is number 
                //except the cell ie board[row][col]  using "&& (i != row || j != col)"
                if(board[i][j] == number && (i != row || j != col)) return false;  
            }
        }

        //all condions passed return true valid position
        return true;
    }
    
}
