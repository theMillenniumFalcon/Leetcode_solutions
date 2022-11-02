import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public int numJewelsInStones(String jewels, String stones) {
        int s1 = stones.length();
        int j1 = jewels.length();
        int count = 0;
        
        for (int i = 0; i < j1; i++) {
            for (int j = 0; j < s1; j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }

        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }

        return count;
    }
}