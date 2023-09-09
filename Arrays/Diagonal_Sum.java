package Data_Structures.Arrays;
public class Diagonal_Sum {

    public static int diasum(int a[][]){
        int s=0;
        int b=0;
        for(int i=0;i<a.length;i++){
            s = s+a[i][i];
            b = i!=(a[0].length-1-i)?b+a[i][(a[0].length-1-i)]:b+0;
        }
        int t=b+s;
        return t;
    }
    
    public static void main(String args[]){
        int a[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        System.out.println("Diagonal Sum:"+diasum(a));
    }
}
