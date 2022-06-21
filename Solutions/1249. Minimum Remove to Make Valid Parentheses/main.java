public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(n)
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else if(ch == ')') {
                if (open == 0) continue;
                open--;
            }

            sb.append(ch);
        }

        StringBuilder res = new StringBuilder();

        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && open-- > 0) continue;
            res.append(sb.charAt(i));   
        }

        return res.reverse().toString();
    }
}