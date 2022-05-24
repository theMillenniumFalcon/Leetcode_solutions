import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(log (Max(piles)) * len(piles))
    // SC: O(1)
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = Integer.MAX_VALUE;
        int start = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length - 1; i ++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int end = max;
        while (start <= end) {
            int mid = (start + end) / 2;
            int hours = count(piles, mid);

            if (hours >= h) {
                minSpeed = Math.min(minSpeed, mid);
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return minSpeed;
    }

    public int count(int[] arr, int num) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += (arr[i] / num) + (arr[i] % num == 0 ? 0 : 1);
        }
        return res;
    }
}