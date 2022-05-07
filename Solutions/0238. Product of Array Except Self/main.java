import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left_product = new int[n];
        int[] right_product = new int[n];

        int[] output_array = new int[n];

        left_product[0] = 1;
        right_product[n-1] = 1;

        for (int i = 1; i < n; i++) {
            left_product[i] = nums[i-1] * left_product[i-1];
        }

        for (int i = n-2; i >= 0; i--) {
            right_product[i] = nums[i+1] * right_product[i+1];
        }

        for (int i = 0; i < n; i++) {
            output_array[i] = left_product[i] * right_product[i];
        }
        return output_array;
    }

    // TC : O(n)
    // SC: O(1)
    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }
}
