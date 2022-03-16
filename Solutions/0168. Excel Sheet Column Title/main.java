public class main {
    public static void main(String[] args) {

    }

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        helper(columnNumber, sb);
        return sb.toString();
    }

    public void helper(int n, StringBuilder s) {
        if (n == 0) {
            return;
        }

        n--;
        char digit = (char) ('A' + (n % 26));
        helper(n / 26, s);
        s.append(digit);
    }
}