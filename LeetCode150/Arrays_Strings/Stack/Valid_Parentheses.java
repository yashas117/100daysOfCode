package LeetCode150.Stack;

import java.util.Stack;

public class Valid_Parentheses {
    
    public static boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(!st.isEmpty() && (ch == ')' && st.peek() == '(')){
                    st.pop();
                }else if(!st.isEmpty() && (ch == '}' && st.peek() == '{')){
                    st.pop();
                }else if(!st.isEmpty() && (ch == ']' && st.peek() == '[')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
