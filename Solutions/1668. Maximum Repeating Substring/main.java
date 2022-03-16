public class main {
    public static void main(String[] args) {

    }

    public int maxRepeating(String sequence, String word) {
        String s = "";
        int count = 0;
        while (s.length() <= sequence.length()) {
            if (sequence.contains(s)) {
                count++;
                s += word;
            } else
                break;
        }
        return count - 1;
    }
}