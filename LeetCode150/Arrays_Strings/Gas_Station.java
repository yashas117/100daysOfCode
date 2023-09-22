package LeetCode150.Arrays_Strings;

public class Gas_Station {

    public static void main(String args[]){

        int gas[] = {1, 2, 3, 4, 5};
        int cost[] = {3, 4, 5, 1, 2};

        System.out.print(canCompleteCircuit(gas, cost));
    }
    
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int k=0;
        int i=0;
        int max=0,j;
        for(j=0;j<gas.length;j++){
            k = k + (gas[j]-cost[j]);
            max = max + (gas[j]-cost[j]);
            if(max < 0){
                max = 0;
                i= j+1;
            }
        }
        
        return k < 0 ? -1 : i;
    }
}
