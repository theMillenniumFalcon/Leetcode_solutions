public class main {
    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(n)
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();

        for (String word : s.split("\\s")) {
            reversed.append(new StringBuilder(word).reverse()).append(" ");
        }

        return reversed.toString().trim();
    }
}