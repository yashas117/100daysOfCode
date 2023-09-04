package Data_Structures.Greedy_Algo;
import java.util.*;

public class chocola {
    
    public static void main(String args[]){

        //int n = 4, m = 6;
        Integer hor[] = {2, 1, 3, 1, 4};
        Integer ver[] = {4, 1, 2};

        Arrays.sort(hor , Collections.reverseOrder());
        Arrays.sort(ver , Collections.reverseOrder());
        int h=0;
        int v=0;
        int cost = 0;
        int hcut = 1;
        int vcut = 1;

        while(h < hor.length && v < ver.length){

            if(hor[h] >= ver[v]){
                cost = cost + hor[h]*vcut;
                h++;
                hcut++;
            }
            else{
                cost = cost + ver[v]*hcut;
                v++;
                vcut++;
            }
        }
        while(h < hor.length){
            cost = cost + hor[h]*vcut;
            h++;
        }
        while(v < ver.length){
            cost = cost + ver[v]*hcut;
            v++;
        }

        System.out.println(cost);
    }
}
