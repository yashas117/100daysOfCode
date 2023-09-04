package Data_Structures.Greedy_Algo;
import java.util.*;
public class Activity_selection {
    
    public static void main(String args[]){

        int st[] = {1, 3, 0, 5, 8 ,5};
        int en[] = {2, 4, 6, 7, 9, 9};
        //end time basis sorted

        //sorting
        int act[][] = new int[st.length][3];
        for(int i = 0;i<st.length;i++){
            act[i][0] = i;
            act[i][1] = st[i];
            act[i][2] = en[i];
        }
        //lambda function -> shortform
        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));
        int max = 0;

        ArrayList<Integer> a = new ArrayList<>();

        max = 1;
        // a.add(0);
        a.add(act[0][0]);
        // int lastend = en[0];
        int lastend = act[0][2];
        for(int i=1;i<en.length; i++){
            if(act[i][1] >= lastend){
                lastend = act[i][2];
                max++;
                a.add(act[i][0]);
            }
        }

        System.out.println("Max activities : "+ max);
        for(int i = 0;i<a.size();i++){
            System.out.print("A"+a.get(i)+" ");
        }
        System.out.println();
    }
}
