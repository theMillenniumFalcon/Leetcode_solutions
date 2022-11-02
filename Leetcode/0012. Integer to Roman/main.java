import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(num)
    // SC: O(1)
    public String intToRoman(int num) {
        int[] value = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < value.length && num > 0; i++) {
            while (num >= value[i]) {
                res.append(roman[i]);
                num -= value[i];
            }
        }

        return res.toString();
    }
}