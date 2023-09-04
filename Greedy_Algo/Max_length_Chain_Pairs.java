package Data_Structures.Greedy_Algo;
import java.util.*;
public class Max_length_Chain_Pairs {
    
    public static void main(String args[]){

        int p[][] = {{5,24} , {39,60} , {5,28} , {27,40} , {50,90}};

        Arrays.sort(p , Comparator.comparingDouble(o -> o[1]));
        int count =1;
        int curr = p[0][1];
        for(int i=1;i<p.length;i++){
            if(curr < p[i][0]){
                count++;
                curr = p[i][1];
            }
        }
        System.out.println(count);
    }
}
