import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of points
    // SC: O(1)
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int result = 1;
        int previous = 0;

        for (int current = 1; current < points.length; current++) {
            if (points[current][0] > points[previous][1]) {
                result++;
                previous = current;
            }
        }

        return result;
    }
}