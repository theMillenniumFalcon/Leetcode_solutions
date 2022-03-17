public class main {
    public static void main(String[] args) {
        
    }

    static int[] sortArrayByParity(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[index];
                nums[index++] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
