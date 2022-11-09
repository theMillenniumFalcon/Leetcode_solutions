import java.util.Stack;

class StockSpanner {

    class Pair {
        int price;
        int index;
    }

    Stack<Pair> stack;
    int time = 0;

    public StockSpanner() {
        stack = new Stack<>();
        Pair base = new Pair();
        base.price = 1000000;
        base.index = -1;
        stack.push(base);
    }

    // TC : O(n)
    // SC: O(n)
    public int next(int price) {
        Pair pair = new Pair();
        pair.price = price;
        pair.index = time;
        time++;

        while (stack.peek().price <= pair.price) {
            stack.pop();
        }

        int ans = pair.index - stack.peek().index;

        stack.push(pair);

        return ans;
    }
}