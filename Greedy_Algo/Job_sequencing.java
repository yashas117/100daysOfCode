package Data_Structures.Greedy_Algo;
import java.util.*;

public class Job_sequencing {
    
    static class Job {
        char id;
        int deadline;
        int profit;
        Job(char id,int deadline,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void printJobScheduling(ArrayList<Job> arr){

        Collections.sort(arr, (a,b) -> b.profit - a.profit); // descending order

        ArrayList<Character> s = new ArrayList<>();
        
        int time =0;
        for(int i=0;i<arr.size();i++){
            Job curr = arr.get(i);
            if(curr.deadline > time){
                s.add(curr.id);
                time++;
            }
        }
        
        // print sequence
        System.out.println("max jobs = "+s.size());
        for(int i =0;i<s.size(); i++){
            System.out.print(s.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        ArrayList<Job> arr = new ArrayList<Job>();

        arr.add(new Job('a',2,100));
        arr.add(new Job('b',1,19));
        arr.add(new Job('c',2,27));
        arr.add(new Job('d',1,25));
        arr.add(new Job('e',3,15));

        //System.out.println("Following is maximum " + "profit sequence of jobs");
        printJobScheduling(arr);
    }
}
