import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n), n -> lengthof triplets
    // SC: O(1)
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int n = triplets.length;
        int[] current = new int[3];
        Arrays.fill(current, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            if (current[0] == target[0] && current[1] == target[1] && current[2] == target[2]) {
                return true;
            } else if (triplets[i][0] <= target[0] && triplets[i][1] <= target[1] && triplets[i][2] <= target[2]) {
                current[0] = Math.max(current[0], triplets[i][0]);
                current[1] = Math.max(current[1], triplets[i][1]);
                current[2] = Math.max(current[2], triplets[i][2]);
            }
        }

        return current[0] == target[0] && current[1] == target[1] && current[2] == target[2];
    }
}