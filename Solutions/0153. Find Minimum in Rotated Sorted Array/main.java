public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(log n)
    // SC: O(1)
    public int findMin(int[] nums) {
        int res = nums[0];
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] < nums[right]) {
                res = Math.min(res, nums[left]);
                break;
            }

            int mid = (left + right) / 2;
            res = Math.min(res, nums[mid]);
            
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}