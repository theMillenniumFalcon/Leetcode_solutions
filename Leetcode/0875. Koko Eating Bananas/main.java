public class main {
    public static void main(String[] args) {

    }

    // TC : O(n logn)
    // SC: O(1)
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        long high = piles[0];
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (!isPossibleToEatAll(piles, h, mid)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) low;
    }

    public boolean isPossibleToEatAll(int[] piles, int hours, long currK) {
        long count = 0;
        for (long pile : piles) {
            count += pile / currK;
            if (pile % currK != 0) {
                count++;
            }
        }
        return (count <= hours);
    }
}