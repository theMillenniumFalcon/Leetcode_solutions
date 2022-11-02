public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(1)
    static boolean canJump(int[] nums) {
        int last = nums.length - 1;
        
        for (int i = last; i >= 0; i--) {
            if (i + nums[i] >= last) {
                last = i;
            }
        }
        
        return last == 0;
    }
}
