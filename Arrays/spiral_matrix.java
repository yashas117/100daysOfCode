package Data_Structures.Arrays;
import java.util.*;

public class spiral_matrix {
    
    public static ArrayList<Integer> spiral(int a[][]){

        ArrayList<Integer> spi = new ArrayList<>();
        int colmin =0,
        colmax =a[0].length-1,
        rowmin =0,
        rowmax =a.length-1;
        int i;
        while(colmin<=colmax && rowmin<=rowmax){
            for(i=colmin;i<=colmax;i++){
                spi.add(a[rowmin][i]);
            }
            for(i=rowmin+1;i<=rowmax;i++){
                spi.add(a[i][colmax]);
            }
            for(i=colmax-1;i>=colmin;i--){
                if(rowmin==rowmax){
                    break;
                }
                spi.add(a[rowmax][i]);
            }
            for(i=rowmax-1;i>=rowmin+1;i--){
                if(colmin==colmax){
                    break;
                }
                spi.add(a[i][colmin]);
            }
            colmin++;rowmin++;colmax--;rowmax--;
        }
        return spi;
    }
    public static void main(String args[]){

        int a[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        System.out.println(spiral(a));

    }
}
