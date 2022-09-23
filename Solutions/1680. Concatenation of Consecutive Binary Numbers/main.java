public class main {
    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(1)
    public int concatenatedBinary(int n) {
        long modulo = (long) (1e9 + 7);
        long result = 0;

        int currentNumber = 0;
        while (currentNumber <= n) {
            result = ((result << (1 + log2(currentNumber))) % modulo + currentNumber) % modulo;
            currentNumber++;
        }

        return (int) result;
    }

    public int log2(int N) {
        return (int) (Math.log(N) / Math.log(2));
    }
}