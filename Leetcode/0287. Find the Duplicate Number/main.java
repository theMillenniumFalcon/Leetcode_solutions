public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(1)
    public int findDuplicate(int[] nums) {
        int k = 0;

        while (k < nums.length) {
            int correct = nums[k] - 1;
            if (nums[k] != nums[correct]) {
                int temp = nums[k];
                nums[k] = nums[correct];
                nums[correct] = temp;
            } else {
                k++;
            }
        }

        return nums[nums.length - 1];
    }
}
