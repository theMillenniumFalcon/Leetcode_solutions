import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(m*n * log(D)) , D -> min(m, n)
    // SC: O(m*n)
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int diagonalKey = i - j;
                PriorityQueue<Integer> queue = map.getOrDefault(diagonalKey, new PriorityQueue<>());
                queue.offer(mat[i][j]);
                map.put(diagonalKey, queue);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int diagonalKey = i - j;
                PriorityQueue<Integer> queue = map.get(diagonalKey);

                mat[i][j] = queue.poll();
            }
        }

        return mat;
    }
}