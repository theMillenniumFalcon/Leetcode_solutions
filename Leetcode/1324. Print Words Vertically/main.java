import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
    }

    public List<String> printVertically(String s) {
        List<String> result = new ArrayList<String>();
        String[] words = s.split(" ");
        int maxWordLength = getMaxLength(words);
        for (int i = 0; i < maxWordLength; i++) {
            StringBuilder str = new StringBuilder();
            for (String word : words) {
                if (i >= word.length()) {
                    str.append(" ");
                } else {
                    str.append(word.charAt(i));
                }
            }
            result.add(trimRight(str.toString()));
        }

        return result;
    }

    public int getMaxLength(String[] words) {
        int max = 0;
        for (String word : words) {
            max = Math.max(max, word.length());
        }

        return max;
    }

    public String trimRight(String word) {
        int i = word.length();
        while (--i > -1) {
            if (word.charAt(i) != ' ') {
                return word.substring(0, i + 1);
            }
        }

        return null;
    }
}