public class main {
    public static void main(String[] args) {
        
    }

    // TC: O(1)
    // SC: O(1)
    public double nthPersonGetsNthSeat(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 0.5;
        }
    }
}