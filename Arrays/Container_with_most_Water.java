package Data_Structures.Arrays;

public class Container_with_most_Water {

    public static void main(String args[]){

        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum amount of water : "+maxArea(height));
    }
    public static int maxArea(int[] height) {
        int curr;
        int max = 0;
        int lp = 0;
        int h;
        int rp = height.length-1;
        while(lp < rp){
            h = Math.min(height[lp], height[rp]);
            curr = h * (rp - lp);
            max = Math.max(max, curr);
            if(height[lp] > height[rp]){
                rp--;
            } 
            else{
                lp++;
            }
        }
        return max;
    }
}
