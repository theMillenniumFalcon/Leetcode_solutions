public class main {
    public static void main(String[] args) {
        
    }

    public int singleNumber(int[] nums) {
        int unique = 0;

        for (int n : nums) {
            unique ^= n;
        }

        return unique;
    }
}