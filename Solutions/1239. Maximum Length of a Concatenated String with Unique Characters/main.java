import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of arr
    // SC: O(n), n -> length of arr
    public int maxLength(List<String> arr) {
        List<String> resList = new ArrayList<>();
        int res = 0;

        resList.add("");

        for (String str : arr) {
            if (!checkUniqueCharString(str)) {
                continue;
            }
            List<String> newAnsListWithCurrentString = new ArrayList<>();

            for (String candidate : resList) {
                String temp = candidate + str;
                if (checkUniqueCharString(temp)) {
                    newAnsListWithCurrentString.add(temp);
                    res = Math.max(res, temp.length());
                }
            }
            resList.addAll(newAnsListWithCurrentString);
        }

        return res;
    }

    public boolean checkUniqueCharString(String str) {
        if (str.length() > 26) {
            return false;
        }
        int[] freq = new int[26];
        char[] arr = str.toCharArray();

        for (char ch : arr) {
            freq[ch - 'a']++;
            if (freq[ch - 'a'] > 1) {
                return false;
            }
        }

        return true;
    }
}