import java.util.*;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(26) + O(s2) = O(s2), s2 -> length of string s2
    // SC: O(s1 + s2), s1 -> length of string s1, s2 -> length of string s2
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(arr1, arr2)) {
            return true;
        }
        int st = 0;
        int end = s1.length();

        while (end < s2.length()) {
            arr2[s2.charAt(st) - 'a']--;
            arr2[s2.charAt(end) - 'a']++;

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
            st++;
            end++;
        }

        return false;
    }
}