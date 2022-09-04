public class main {
    public static void main(String[] args) {

    }

    // TC: O(message.length + key.length)
    // SC: O(1)
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        int i = 0;
        for (char ch : key.toCharArray()) {
            if (i < 26 && ch != ' ' && map[ch - 'a'] == 0) {
                map[ch - 'a'] = (char) (i + 'a');
                i++;
            }
        }
        String ans = "";

        for (char ch : message.toCharArray()) {
            ans += (ch == ' ' ? ' ' : map[ch - 'a']);
        }

        return ans;
    }
}
