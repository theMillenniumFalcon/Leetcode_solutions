import java.util.*;

// TC : O(1)
// SC: O(n)
class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min_vals;

    public MinStack() {
        stack = new Stack<>();
        min_vals = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (min_vals.isEmpty() || val <= min_vals.peek()) {
            min_vals.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(min_vals.peek())) {
            min_vals.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_vals.peek();
    }
}