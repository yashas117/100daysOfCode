package Data_Structures.Greedy_Algo;

public class Kth_Largest_oddNum {

    /*Find the kth largest odd number  */

    public static int largestOdd(int l, int r, int k){

        int n = r-l+1;
        int odd = l%2!=0 && r%2!=0? (n+1)/2 : n/2;
        if(k > odd){
            return 0;
        }
        if(r%2 == 0){
            return (r-1)-(k-1)*2;
        }
        else{
            return r-(k-1)*2;
        }
    }
    
    public static void main(String args[]){

        int L = -3, R = 9;
        int k=5;
        System.out.println(largestOdd(L,R,k));
    }
}
