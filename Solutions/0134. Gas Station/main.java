import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(1)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (sum(gas) < sum(cost))
            return -1;
        int total = 0;
        int res = 0;

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);

            if (total < 0) {
                total = 0;
                res = i + 1;
            } 
        }

        return res;
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
