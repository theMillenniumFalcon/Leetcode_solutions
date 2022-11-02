import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(n), n -> length of bank
    public int minMutation(String start, String end, String[] bank) {
        int len = bank.length;
        boolean[] visited = new boolean[len];
        int stepCount = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String gene = queue.poll();
                if (gene.equals(end)) {
                    return stepCount;
                }

                for (int i = 0; i < len; i++) {
                    if (visited[i]) {
                        continue;
                    }
                    if (isValidMutation(gene, bank[i])) {
                        queue.offer(bank[i]);
                        visited[i] = true;
                    }
                }
            }
            stepCount++;
        }

        return -1;
    }

    public boolean isValidMutation(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }
}