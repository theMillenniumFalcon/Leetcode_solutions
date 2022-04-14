import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public List<Integer> majorityElement(int[] nums) {
        int number1 = -1, number2 = -1, count1 = 0, count2 = 0, length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == number1) count1++;
            else if (nums[i] == number2) count2++;
            else if (count1 == 0) {
                number1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                number2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < length; i++ ) {
            if (nums[i] == number1) {
                count1++;
            } else if (nums[i] == number2) {
                count2++;
            }
        }
        if (count1 > length / 3) {
            res.add(number1);
        }
        if (count2 > length / 3) {
            res.add(number2);
        }

        return res;
    }
}