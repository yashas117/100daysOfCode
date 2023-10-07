package LeetCode150.Matrix;

public class Set_Zeros {

    public static void setZeroes(int[][] matrix) {

        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(row[i] == true){
                for(int m=0;m<matrix[0].length;m++){
                    matrix[i][m] = 0;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(col[i] == true){
                for(int m=0;m<matrix.length;m++){
                    matrix[m][i] = 0;
                }
            }
        }
    }
    
}
