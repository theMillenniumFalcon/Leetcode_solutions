import java.util.Stack;

public class main {
    public static void main(String[] args) {

    }

    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int n = s.length();
        char sign = '+';

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int val = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    val = val * 10 + (s.charAt(i) - '0');
                    i ++;
                }
                i --;

                if (sign == '+') {
                    stack.push(val);
                } else if (sign == '-') {
                    stack.push(-val);
                } else if (sign == '*') {
                    int a = stack.pop();
                    int ans = a * val;
                    stack.push(ans);
                } else if (sign == '/') {
                    int a = stack.pop();
                    int ans = a / val;
                    stack.push(ans);
                }
            } else if (ch != ' ') {
                sign = ch;
            }
        }

        int sum = 0;
        while (stack.size() > 0) {
            sum += stack.pop();
        }

        return sum;
    }
}