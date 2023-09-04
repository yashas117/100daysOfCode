package Data_Structures.Greedy_Algo;
import java.util.*;

public class Indian_Coins { // Minimum number of coins to pay a value
    
    public static void main(String args[]){

        int value = 4;
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int count=0;
        int len = coins.length-1;
        ArrayList<Integer> n = new ArrayList<>();
        while(value!=0){
            if(coins[len] <= value){
                count++;
                n.add(coins[len]);
                value = value - coins[len];
            }
            else{
                len--;
            }
        }
        System.out.println(count);
        for(int i=0;i<n.size();i++){
            System.out.print(n.get(i)+" ");
        }
    }
}
