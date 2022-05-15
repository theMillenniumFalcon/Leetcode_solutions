import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(26) + O(s2) = O(s2), s2 -> length of string s2
    // SC: O(s1 + s2), s1 -> length of string s1, s2 -> length of string s2
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();


        for (int i : s1.toCharArray()) {
            
        }
    }
}