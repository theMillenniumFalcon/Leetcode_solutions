public class main {
    public static void main(String[] args) {
        
    }

    public int maxDepth(String s) {
        int c = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(') {
                c ++;
                max = Math.max(max, c);
            } else if (s.charAt(i) == ')') {
                c --;
            }
        }
        
        return max;
    }
}