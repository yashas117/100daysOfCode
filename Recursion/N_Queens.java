package Data_Structures.Recursion;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {

    public static void main(String args[]){

        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        
        List<List<String>> allboards = new ArrayList<>();
        char[][] board = new char[n][n];

        Queen(board, allboards, 0);

        return allboards;
    }

    public static void Queen(char[][] board, List<List<String>> allboards, int col){

        if(col == board.length){
            saveboard(board, allboards);
        }
        for(int row=0; row<board.length;row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                Queen(board, allboards, col+1);
                board[row][col] = '.';

            }
        }
    }
    public static boolean isSafe(int row, int col, char[][] board){

        for(int j=0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        for(int i=0; i<board[0].length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        r = row;
        for(int c=col; c<board.length && r<board.length; r++, c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void saveboard(char[][] board, List<List<String>> allboards){

        String row = "";
        List<String> newboard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row = "";
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }
                else{
                    row += '.';
                }
            }
            newboard.add(row);
        }
        allboards.add(newboard);
    }
}

