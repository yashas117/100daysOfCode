package Data_Structures.Greedy_Algo;
import java.util.*;
public class Fractional_Knapsack {
    
    public static void main(String args[]){

        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;
        double ratio[][] = new double[value.length][2];

        for(int i=0;i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double max=0;
        double v=0;
        for(int i=ratio.length-1;i>=0;i--){
                if( (w-max) > weight[(int)ratio[i][0]]){
                    v = v + value[(int)ratio[i][0]];
                    max = max + weight[(int)ratio[i][0]];
                }
                else{
                    v = v + ratio[i][1]*(w-max);
                    break;
                }
        }

        System.out.println(v);
    }
}
