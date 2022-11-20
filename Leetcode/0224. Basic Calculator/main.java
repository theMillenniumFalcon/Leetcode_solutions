import java.util.Stack;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of string
    // SC: O(n), n -> length of string
    public int calculate(String s) {
        int len = s.length();
        int sign = 1;
        int ans = 0;
        int currentNum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                currentNum = s.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    currentNum = currentNum * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                currentNum = currentNum * sign;
                ans += currentNum;
                currentNum = 0;
                sign = 1;
            } else if (s.charAt(i) == '+') {
                sign = 1;
            } else if (s.charAt(i) == '-') {
                sign = -1;
            } else if (s.charAt(i) == '(') {
                // store the result calculated till now
                stack.push(ans);
                // store the upcoming sign
                stack.push(sign);
                ans = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                int prevSign = stack.pop();
                ans = prevSign * ans;
                int prevAns = stack.pop();
                ans = ans + prevAns;
            }
        }

        return ans;
    }
}