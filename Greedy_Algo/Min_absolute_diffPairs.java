package Data_Structures.Greedy_Algo;
import java.util.*
;public class Min_absolute_diffPairs {
    
    public static void main(String args[]){

        int a[] = {4,1,8,7};
        int b[] = {2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);

        int min =0;
        for(int i=0;i<a.length;i++){
            min = min + Math.abs(a[i]-b[i]);
        }

        System.out.println(min);

    }
}
