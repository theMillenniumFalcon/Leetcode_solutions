public class main {
    public static void main(String[] args) {
        
    }

    public int countPoints(String rings) {
        int res = 0;
        for (int i = 0; i <= 10; i++) {
            if (rings.contains("B" + i) && rings.contains("R" + i) && rings.contains("G" + i)) {
                res++;
            }
        }

        return res;
    }
}