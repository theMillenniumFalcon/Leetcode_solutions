public class main {
    public static void main(String[] args) {

    }

    // TC : O(log n)
    // SC: O(1)
    public double myPow(double x, int n) {
        double ans = 1.0;
        long duplicate = n;
        
        if (duplicate < 0) duplicate = -1 * duplicate;

        while (duplicate > 0) {
            if (duplicate % 2 == 1) {
                ans = ans * x;
                duplicate = duplicate - 1;
            } else {
                x = x * x;
                duplicate = duplicate / 2;
            }
        }

        if (n < 0) {
            ans = (double)(1.0) / (double)(ans);
        }

        return ans;
    }
}