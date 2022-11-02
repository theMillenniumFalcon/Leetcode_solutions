import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n), n -> no. of string elements in array
    // SC: O(n)
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (String s : tokens) {
            if (isOperator(s)) {
                int s2 = Integer.parseInt(stack.pop());
                int s1 = Integer.parseInt(stack.pop());
                int ans = 0;

                if (s.equals("*")) {
                    ans = s1 * s2;
                } else if (s.equals("/")) {
                    ans = s1 / s2;
                } else if (s.equals("+")) {
                    ans = s1 + s2;
                } else if (s.equals("-")) {
                    ans = s1 - s2;
                }
                stack.push(ans + "");
            } else {
                stack.push(s);
            }
        }

        return Integer.parseInt(stack.peek());
    }

    public boolean isOperator(String s) {
        if (s.equals("*") || s.equals("/") || s.equals("+") || s.equals("-")) {
            return true;
        } else {
            return false;
        }
    }
}