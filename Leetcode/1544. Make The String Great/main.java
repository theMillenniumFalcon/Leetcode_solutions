import java.util.Stack;

public class main {
    public static void main(String[] args) {
        
    }

    public String makeGood(String s) {
        Stack<Character> st =  new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && (st.peek() == ch + 32 || st.peek() == ch - 32)){
                st.pop();
            } else{
                st.push(ch);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        return ans;
    }


    // * ------------------OR------------------

    public String makeGood2(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) + 32 == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 1) + 32) {
                return makeGood(s.substring(0, i) + s.substring(i + 2));
            }
        }

        return s;
    }
}