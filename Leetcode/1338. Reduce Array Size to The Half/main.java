import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[][] arr1 = new int[map.keySet().size()][2];
        int j = 0;
        for (int i : map.keySet()) {
            arr1[j][0] = i;
            arr1[j][1] = map.get(i);
            j++;
        }

        Arrays.sort(arr1, (a, b) -> b[1] - a[1]);
        int sum = 0, count = 0;

        j = 0;
        while (sum < arr.length / 2) {
            count++;
            sum += arr1[j][1];
            j++;

        }
        return count;
    }
}