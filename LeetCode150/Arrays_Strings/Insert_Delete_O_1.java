package LeetCode150.Arrays_Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class Insert_Delete_O_1 {
    ArrayList<Integer> num;
    HashMap<Integer, Integer> loc;
    java.util.Random rand = new java.util.Random();
    public Insert_Delete_O_1() {
        num = new ArrayList<Integer>();
        loc = new HashMap<Integer, Integer>();
    }
    
    public boolean insert(int val) {
        boolean contains = loc.containsKey(val);
        if(contains) {
            return false;
        }
        loc.put(val, num.size());
        num.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        
        boolean contains = loc.containsKey(val);
        if(!contains){
            return false;
        }
        int locs = loc.get(val);
        if(locs < num.size()-1){
            int last = num.get(num.size()-1);
            num.set(locs, last);
            loc.put(last, locs);
        }
        loc.remove(val);
        num.remove(num.size()-1);
        return true;
    }
    
    public int getRandom() {
        return num.get(rand.nextInt(num.size()));
    }
}
