public class main {
    public static void main(String[] args) {
        
    }

    public int hammingWeight(int n) {
        int result = 0;

        while (n >= 0) {
            result += n % 2;
            n = n >> 1;
        }


        return result;
    }
}