import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (stack.size() > 0 && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }
}