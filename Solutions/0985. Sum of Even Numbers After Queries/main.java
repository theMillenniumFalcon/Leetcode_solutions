public class main {
    public static void main(String[] args) {

    }

    // TC: O(n + m), n -> length of nums, m -> length of queries
    // SC: O(1)
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res = new int[nums.length];

        int sum = helper(nums);

        int i = 0;

        for (int[] query : queries) {
            if (nums[query[1]] % 2 == 0) {
                sum -= nums[query[1]];
            }
            nums[query[1]] += query[0];

            if (nums[query[1]] % 2 == 0) {
                sum += nums[query[1]];
            }
            res[i++] = sum;
        }

        return res;
    }

    public int helper(int[] arr) {
        int ans = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                ans += i;
            }
        }
        return ans;
    }
}