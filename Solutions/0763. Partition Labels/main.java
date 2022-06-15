import java.util.*;;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(2^n)
    // SC: O(n)
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitionLength = new ArrayList<>();
        int[] lastIndex = new int[26];

        for (int i = 0;i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'];
        }

        int i = 0;
        while (i < s.length()) {
            int end = lastIndex[s.charAt(i) - 'a'];
            int j = i + 1;
            while (j != end) {
                end = Math.max(end, )
            }
        }
    }
}