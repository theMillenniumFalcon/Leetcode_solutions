import java.util.Stack;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(n)
    public int calPoints(String[] ops) {
        Integer topElement = null;
        Integer secondtopElement = null;
        Stack<Integer> stack = new Stack<Integer>();
        for (String op : ops) {
            switch (op.toCharArray()[0]) {
                case 'C':
                    stack.pop();
                    break;
                case 'D':
                    topElement = stack.peek();
                    stack.push(2 * topElement);
                    break;
                case '+':
                    topElement = stack.pop();
                    secondtopElement = stack.peek();
                    stack.push(topElement);
                    stack.push(topElement + secondtopElement);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;

            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans = ans + stack.pop();
        }
        return ans;
    }
}