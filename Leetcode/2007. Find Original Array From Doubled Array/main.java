import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of changed
    // SC: O(n), n -> length of changed
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[(changed.length / 2)];

        for (int i = 0; i < changed.length; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }
        int limit = 0;

        Arrays.sort(changed);
        for (int i : changed) {
            if (map.get(i) <= 0) {
                continue;
            }
            if (map.getOrDefault(2 * i, 0) <= 0) {
                return new int[0];
            }
            arr[limit] = i;
            limit++;

            map.put(i, map.get(i) - 1);
            map.put(2 * i, map.get(2 * i) - 1);
        }

        return arr;
    }
}