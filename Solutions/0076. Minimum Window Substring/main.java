import java.util.HashMap;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n)
    // SC: O(n)
    public String minWindow(String s, String t) {
        String ans = "";

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        int matchCount = 0;
        int desiredMatchCount = t.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        int i = -1;
        int j = -1;

        while (true) {
            boolean flag1 = false;
            boolean flag2 = false;

            // acquire
            while (i < s.length() - 1 && matchCount < desiredMatchCount) {
                i++;
                char ch = s.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);

                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    matchCount++;
                }
                flag1 = true;
            }

            // collect answer and release
            while (j < i && matchCount == desiredMatchCount) {
                String potentialAns = s.substring(j + 1, i + 1);
                if (ans.length() == 0 || potentialAns.length() < ans.length()) {
                    ans = potentialAns;
                }
                j++;
                char ch = s.charAt(j);

                if (map1.get(ch) == 1) {
                    map1.remove(ch);
                } else {
                    map1.put(ch, map1.get(ch) - 1);
                }

                if (map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)) {
                    matchCount--;
                }
                flag2 = true;
            }

            if (flag1 == false && flag2 == false) {
                break;
            }
        }

        return ans;
    }
}