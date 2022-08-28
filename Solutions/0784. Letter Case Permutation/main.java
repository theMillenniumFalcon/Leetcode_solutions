import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(n) -> auxiliary space
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() == 0) {
            return res;
        }
        helper(s.toCharArray(), res, 0);

        return res;
    }

    public void helper(char[] str, List<String> res, int index) {
        if (index == str.length) {
            res.add(new String(str));
            return;
        }
        if (Character.isDigit(str[index])) {
            helper(str, res, index + 1);
        } else {
            str[index] = Character.toLowerCase(str[index]);
            helper(str, res, index + 1);

            str[index] = Character.toUpperCase(str[index]);
            helper(str, res, index + 1);
        }
    }
}