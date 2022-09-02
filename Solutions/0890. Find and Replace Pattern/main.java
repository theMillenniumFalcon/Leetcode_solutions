import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n * AvgLen(String_in_words))
    // SC: O(AvgLen(String_in_words))
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String normalizedPattern = normalize(pattern);
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (normalizedPattern.equals(normalize(word))) {
                ans.add(word);
            }
        }
        return ans;
    }

    public String normalize(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i), map.size());
            ans += map.get(str.charAt(i));
        }

        return ans;
    }
}