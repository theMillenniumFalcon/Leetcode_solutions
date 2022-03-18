import java.util.List;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        
    }

    static List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList<>();
        if (digits.length() == 0) return output;
        output.add("");

        String[] char_map = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));

            while (output.peek().length() == i) {
                String permutation = output.remove();
            }
        }
    }
}