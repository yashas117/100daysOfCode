package LeetCode150.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {

     public static int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> arr = new ArrayList<>();
    
        for (int[] interval : intervals) {
            if (arr.isEmpty() || interval[0] > arr.get(arr.size() - 1)[1]) {
                arr.add(interval);
            } else {
                arr.get(arr.size()-1)[1] = Math.max(interval[1], arr.get(arr.size()-1)[1]);
            }
        }
        return arr.toArray(new int[arr.size()][]);
    } 
}
