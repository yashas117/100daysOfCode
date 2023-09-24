package LeetCode150.Arrays_Strings;

public class Integer_To_Roman {

    public static void main(String args[]){
        
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        
        StringBuilder s = new StringBuilder("");
        
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i=0;
        while(num > 0){

            if(num >= val[i]){
                s.append(roman[i]);
                num = num-val[i];
            }
            else{
                i++;
            }
        }
        return s.toString();
    }
}
