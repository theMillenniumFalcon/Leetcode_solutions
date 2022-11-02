public class main {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
        int ans = 0;

        while (x != 0) {
            if (ans * 10 / 10 != ans) {
                return 0;
            }

            ans = ans * 10 + x % 10;

            x /= 10;
        }

        return ans;
    }
}