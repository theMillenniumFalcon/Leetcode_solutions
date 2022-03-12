public class main {
    public static void main(String[] args) {
        
    }

    public int balancedStringSplit(String s) {
        int balancedCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == 'L') {
                count++;
            } else if (current == 'R') {
                count--;
            }

            if (count == 0) {
                balancedCount++;
            }
        }

        return balancedCount;
    }
}