public class main {
    public static void main(String[] args) {
        
    }

    public int hammingDistance(int x, int y) {
        int count = 0;

        while (x > 0 || y > 0) {
            if (((x & 1) == 1 && (y & 1) == 0) || (((x & 1) == 0) && ((y & 1) == 1))) {
                count++;
            }
            x = x >> 1;
            y = y >> 1;
        }

        return count;
    }
}