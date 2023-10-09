package LeetCode150.Hashmap;

public class Ransom_Note {

    public static void main(String args[])
    {
        String ran = "aa";
        String mag = "aab";
        System.out.println(canConstruct(ran, mag));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        for (char r: ransomNote.toCharArray()){
            int p = magazine.indexOf(r,arr[r-'a']);
            System.out.println(p);
            if(p==-1)
                return false;
            else
                arr[r-'a']= p + 1;
        }
        return true;
    }
}
