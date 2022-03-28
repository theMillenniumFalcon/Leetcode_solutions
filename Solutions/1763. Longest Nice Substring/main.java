import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // * BRUTEFORCE
    public String longestNiceSubstring(String s) {
        String ans = "";

        for (int i = 0; i<= s.length() - 1; i++) {
            for (int j = i; j <= s.length() - 1; j++) {
                String sub = s.substring(i, j + 1);
                if (isNice(sub)) {
                    if (sub.length() > ans.length()) {
                        ans = sub;
                    }
                }
            }
        }

        return ans;
    }

    public boolean isNice(String s) {
        int[] ch = new int[128];
        Arrays.fill(ch, 0);

        for (char c : s.toCharArray()) {
            int k = (int)c;
            ch[k]++;
        }

        for (int j = 0; j < s.length(); j++) {
            if (Character.isUpperCase(s.charAt(j))) {
                if (ch[(int)s.charAt(j) + 32] == 0) return false;
            } else {
                if (ch[(int)s.charAt(j) - 32] == 0) return false;
            }
        }

        return true;
    }

    // * OPTIMIZED
    public String longestNiceSubstring2(String s) {
        if (s.length() < 2) return "";
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) set.add(c);

        for (int i = 0; i< s.length(); i++) {
            if (set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }

            String subStr1 = longestNiceSubstring(s.substring(0, i));
            String subStr2 = longestNiceSubstring(s.substring(i +1));

            return subStr1.length() >= subStr2.length() ? subStr1 : subStr2;
        }

        return s;
    }
}