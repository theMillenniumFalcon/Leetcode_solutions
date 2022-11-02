public class main {
    public static void main(String[] args) {
        
    }

    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs == null || strs.length == 0) {
            return ans;
        }
        
        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return ans;
                }
            }
            ans += c;
            index++;
        }

        return ans;
    }
}