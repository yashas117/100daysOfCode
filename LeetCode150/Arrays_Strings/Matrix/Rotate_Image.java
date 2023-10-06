package LeetCode150.Matrix;

public class Rotate_Image {
    
    public void rotate(int[][] matrix) {
        
        int[][] ans = new int[matrix.length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                ans[i][j] = matrix[i][j];
            }
        }

        int idx1=0;
        int idx2=0;
        for(int i=0; i<ans.length; i++){
            for(int j= ans.length-1; j>=0; j--){
                matrix[idx1][idx2++] = ans[j][i];
            }
            idx1++;
            idx2=0;
        }
    }
}
