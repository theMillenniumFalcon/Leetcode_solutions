import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(n)
    public int largestRectangleArea(int[] heights) {
        int N = heights.length;
        int[] left = new int[N];
        int[] right = new int[N];
        Stack<Integer> stack = new Stack<>();
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int currVal = heights[i];

            while (!stack.isEmpty() && currVal <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty())
                left[i] = 0;
            else
                left[i] = stack.peek() + 1;

            stack.push(i);
        }

        while (!stack.isEmpty())
            stack.pop();

        for (int i = N - 1; i >= 0; i--) {
            int currVal = heights[i];

            while (!stack.isEmpty() && currVal <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty())
                right[i] = N - 1;
            else
                right[i] = stack.peek() - 1;

            stack.push(i);
        }

        for (int i = 0; i < N; i++) {
            int area = heights[i] * (right[i] - left[i] + 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}