import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(s + t)
    // SC: O(s + t)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.equals(t)) return true;
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            map1.merge(s.charAt(i), 1, Integer::sum);
            map2.merge(t.charAt(i), 1, Integer::sum);
        }
        
        for(Character c : map1.keySet()) {
            if(!map1.get(c).equals(map2.get(c))) {
                return false;
            }
        }
        return true;
    }
}