package Data_Structures.Greedy_Algo;

public class Lexico_string {

    /*Two integers N and K
     * print the lexicographically smallest string of length N
     * consisting of lower-case alphabets such that sum = K
     * a=1,b=2.........z=26
     */
    
     public static String lexi(int n, int k){

        StringBuilder s = new StringBuilder("");
        int t = n - ((k-n)/26) -1;
        for(int i=0;i<t;i++){
            s.append('a');
        }
        k = k-t;
        s.append((char)(k%26+'a'-1));
        k = k-(k%26);
        while(k!=0){
            s.append('z');
            k -=26;
        }

        return s.toString();

     }

     public static void main(String args[]){

        int N = 5, K= 102;
        System.out.println(lexi(N,K));
     }
}
