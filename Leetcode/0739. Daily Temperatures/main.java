import java.util.Stack;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(1)
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];

        // we are storing indexes in the stack
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                // found an increasing value for stack.peek() index
                ans[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
        }

        return ans;
    }
}