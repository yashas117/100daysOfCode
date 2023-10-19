package LeetCode150.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class Minimum_arrows {
    
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int k = points[0][1];
        int c=0;
        for(int i=0;i<points.length;i++){
            if(k < points[i][0]){
                k = points[i][1];
                c++;
            }
        }
        return c+1;
    }
}
