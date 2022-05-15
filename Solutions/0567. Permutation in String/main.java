import java.util.HashMap;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(26) + O(s2) = O(s2), s2 -> length of string s2
    // SC: O(n), n -> no. of nodes 
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();
    }
}