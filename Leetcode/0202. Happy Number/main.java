import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public boolean isHappy(int n) {
        HashSet<Integer> visited =  new HashSet<>();
        
        while (n != 1) {
            int current = n;
            int sum = sumOfSquares(current);
            if (visited.contains(sum)) {
                return false;
            }

            visited.add(sum);
            n = sum;
        }

        return true;
    }

    public int sumOfSquares(int n) {
        int res = 0;

        while (n != 0) {
            int digit = n % 10;
            digit *= digit;
            res += digit;
            n = n / 10;
        }

        return res;
    }
}