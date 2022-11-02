import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        
    }

    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (char ch : allowed.toCharArray()) {
            set.add(ch);
        }

        int n = words.length;
        for (int i = 0; i < n; i++) 
        for (char ch : words[i].toCharArray()) {
            if (set.contains(ch)) {
                continue;
            } else {
                count++;
                break;
            }
        }

        return n - count;
    }
}