import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O((2^n) * k*(n/2)), 2^n -> generate every substring, n/2 -> to check if the substring generated is a palindrome
    // k -> inserting the palindromes in another data structure, k -> average length of the palindrome list.
    // SC: O(k * x), k -> average length of the palindrome list, x -> number of such palindromes
    // Auxilairy space = depth of recursion = O(n)
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        helper(0, s, path, res);
        return res;
    }

    public void helper(int index, String s, List<String> path, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                helper(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}