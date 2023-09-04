package Data_Structures.Greedy_Algo;

public class Max_Balanced_Strings {

    /*Find the maximum number balanced substrings 
     * which means equal number of L and R's */
    
    public static int strBalanced(String s,int n){

        if(n == 0){
            return 0;
        }
        int l=0 , r=0 , c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'L'){
                l++;
            }
            else{
                r++;
            }

            if(l == r){
                c++;
            }
        }
        return c;
    }
    
    public static void main(String args[]){

        String str = "LRRRRLLRLLRL";
        int n = str.length();
        System.out.println(strBalanced(str,n));
    }
}
