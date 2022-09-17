import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n * k^2) -> n -> length of words ,k -> Avg. length of the combined
    // sequence
    // SC: O(n) -> n -> length of words
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; ++i) {
            map.put(words[i], i);
        }

        if (map.containsKey("")) {
            int blankIndex = map.get("");
            for (int i = 0; i < words.length; ++i) {
                if (i != blankIndex && isPalindrome(words[i])) {
                    res.add(Arrays.asList(blankIndex, i));
                    res.add(Arrays.asList(i, blankIndex));
                }
            }
        }

        for (int i = 0; i < words.length; ++i) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            Integer reversedIndex = map.get(reversed);
            if (reversedIndex != null && reversedIndex != i) {
                res.add(Arrays.asList(i, reversedIndex));
            }
        }

        for (int i = 0; i < words.length; ++i) {
            String current = words[i];
            for (int cut = 1; cut < current.length(); ++cut) {
                String left = current.substring(0, cut);
                String right = current.substring(cut);
                if (isPalindrome(left)) {
                    String reversedRight = new StringBuilder(right).reverse().toString();
                    if (map.containsKey(reversedRight)) {
                        res.add(Arrays.asList(map.get(reversedRight), i));
                    }
                }
                if (isPalindrome(right)) {
                    String reversedLeft = new StringBuilder(left).reverse().toString();
                    if (map.containsKey(reversedLeft)) {
                        res.add(Arrays.asList(i, map.get(reversedLeft)));
                    }
                }
            }
        }

        return res;
    }

    public boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j--))
                return false;
        }
        return true;
    }
}