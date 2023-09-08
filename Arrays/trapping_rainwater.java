package Data_Structures.Arrays;

public class trapping_rainwater {

    public static int trapped_rainwater(int a[]){  
        int i;
        int len = a.length;
        int left[] = new int[len];           // For left max height
        int right[] = new int[len];          // For right max height
        left[0] = a[0];
        right[len-1] = a[len-1];
        for(i=1; i<len;i++){
            left[i] = Math.max(a[i], left[i-1]); 

            right[len-i-1] = Math.max(right[len-i], a[len-i-1]);
        }
        int trap=0;
        for(i=0;i<len;i++){
        
            trap = trap + (Math.min(left[i],right[i]) - a[i]);
        }
        return trap;
    }
    public static void main(String args[]){
        
        int a[] = {4, 2, 0, 6, 3, 2, 5}; // heights
        int trap = trapped_rainwater(a);
        System.out.print(trap);
    }
}
