public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of sentence
    // SC: O(1)
    public boolean checkIfPangram(String sentence) {
        String[] list = { "a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" };

        for (int i = 0; i < list.length; i++) {
            if (!sentence.contains(list[i]))
                return false;
        }
        return true;
    }
}