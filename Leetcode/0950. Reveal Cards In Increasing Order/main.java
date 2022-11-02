import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n*log(n)) -> for sorting
    // SC: O(n)
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int length = deck.length;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            queue.offer(i);
        }

        int ans[] = new int[length];

        for (int i = 0; i < length; i++) {
            ans[queue.poll()] = deck[i];
            queue.offer(queue.poll());
        }
        return ans;
    }
}