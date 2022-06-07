public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(1)
    // SC: O(1)
    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}