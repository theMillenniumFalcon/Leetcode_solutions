public class main {
    public static void main(String[] args) {
        
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ")+1, s.length()).length();
    }

    // * ------------------OR------------------

    public int lengthOfLastWord2(String s) {
        int last = Integer.MAX_VALUE;
        int first = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (s.charAt(i) != ' ' && last == Integer.MAX_VALUE) {
                last = i;
            }
            
            if (s.charAt(i) == ' ' && last != Integer.MAX_VALUE) {
                first = i + 1;
                return last - first + 1;
            }   
        }
        return last - first + 1;
    }
}