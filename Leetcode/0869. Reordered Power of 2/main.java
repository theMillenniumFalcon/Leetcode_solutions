import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n*log(n))
    // SC: O(n)
    public boolean reorderedPowerOf2(int n) {
        char[] number = sortDigits(n);

        for (int i = 0; i < 30; ++i) {
            char[] powerOfTwo = sortDigits(1 << i);
            if (Arrays.equals(number, powerOfTwo))
                return true;
        }
        return false;
    }

    public char[] sortDigits(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        Arrays.sort(digits);

        return digits;
    }
}