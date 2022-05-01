import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(m * n) n -> Average length of strings; m -> Total number of strings
    // SC: O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        if (strs.length == 0) return res;
        for (String s : strs) {
            char[] hash = new char[26];
            for (char ch : s.toCharArray()) {
                hash[ch - 'a']++;
            }
            String str = new String(hash);
            if (map.get(str) == null) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }

        res.addAll(map.values());
        return res;
    }
}