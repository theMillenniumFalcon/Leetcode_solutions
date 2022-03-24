public class main {
    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        String str = "";
        int i = 0, j = 0;
        for (i = 0, j = 0; i < word1.length() && j < word2.length(); i++, j++) {
            str += word1.charAt(i) + "" + word2.charAt(j);
        }
        str += word1.substring(i, word1.length()) + "" + word2.substring(j, word2.length());
        return str;
    }
}