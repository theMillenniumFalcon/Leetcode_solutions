import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n * log(n))
    // SC: O(n)
    public String orderlyQueue(String s, int k) {
        if (k == 0) {
            return s;
        } else if (k > 1) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        } else if (k == 1) {
            String res = s;
            for (int i = 0; i < s.length(); i++) {
                String reorderedStr = s.substring(i) + s.substring(0, i);
                if (res.compareTo(reorderedStr) > 0) {
                    res = reorderedStr;
                }
            }
            return res;

        }

        return s;
    }
}