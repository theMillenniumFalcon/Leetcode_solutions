public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of nums
    // SC: O(1)
    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= max1) {
                max1 = n;
            } else if (n <= max2) {
                max2 = n;
            } else {
                return true;
            }
        }

        return false;
    }
}