package LeetCode150.Matrix;

public class Game_Life {

    // live cell less than 2 live neighbors dies as if caused by under-population.
    // live cell with two or three live neighbors lives on to the next generation.
    // live cell with more than three live neighbors dies, as if by over-population.
    // dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
    
    public static void gameOfLife(int[][] board) {
        
        int m = board.length-1;
        int n = board[0].length-1;
        if(n == 0){
            board[0][0] = 0;
            board[m][0] = 0;
            for(int i=1;i<m;i++){
                if(board[i][0] == 1 && (board[i-1][0]!=1 || board[i+1][0]!=1)){
                    board[i][0] = 0;
                }
            }
            return ;
        }
        if(m == 0){
            board[0][0] = 0;
            board[0][n] = 0;
            for(int i=1;i<n;i++){
                if(board[0][i] == 1 && (board[0][i-1]!=1 || board[0][i+1]!=1)){
                    board[0][i] = 0;
                }
            }
            return ;
        }
        int arr[][] = new int[board.length][board[0].length];
        arr[0][0] = board[0][1] + board[1][0] + board[1][1];
        arr[0][n] = board[0][n-1] + board[1][n] + board[1][n-1];
        arr[m][0] = board[m][1] + board[m-1][0] + board[m-1][1];
        arr[m][n] = board[m][n-1] + board[m-1][n] + board[m-1][n-1];
        for(int i=1;i<m;i++){
            arr[i][0] = board[i-1][0] + board[i-1][1] + board[i][1] +
                        board[i+1][1] + board[i+1][0];
            arr[i][n] = board[i-1][n] + board[i-1][n-1] + board[i][n-1] +
                        board[i+1][n-1] + board[i+1][n];           
        }
        for(int i=1;i<n;i++){
            arr[0][i] = board[0][i-1] + board[1][i-1] + board[1][i] +
                        board[1][i+1] + board[0][i+1];
            arr[m][i] = board[m][i-1] + board[m-1][i-1] + board[m-1][i] +
                        board[m-1][i+1] + board[m][i+1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j] = board[i-1][j]+board[i-1][j-1]+board[i-1][j+1]+board[i][j+1]+
                            board[i][j-1]+board[i+1][j+1]+board[i+1][j]+board[i+1][j-1];
            }
        }
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(board[i][j] == 1){
                    //case-1
                    if(arr[i][j] < 2 || arr[i][j] > 3){
                        board[i][j] = 0;
                    }
                    //case-2
                    else if(arr[i][j] == 2 || arr[i][j] == 3){
                        board[i][j] = 1;
                    }
                }else{                            // case-4
                    if(arr[i][j] == 3){
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
