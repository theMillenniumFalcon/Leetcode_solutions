import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> res = new ArrayList<>();
        int[] current_interval = intervals[0];
        res.add(current_interval);

        for (int[] i : intervals) {
            int current_end = current_interval[1];
            int next_begin = i[0];
            int next_end = i[1];

            if (current_end >= next_begin) {
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = i;
                res.add(current_interval);
            }
        }

        return res.toArray(new int[res.size()][2]);
    }
}