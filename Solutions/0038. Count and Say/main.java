public class main {
    public static void main(String[] args) {

    }

    // TC: O(n)
    // SC: O(n)
    public String countAndSay(int n) {
        String res = "1";

        for (int i = 1; i < n; i++) {
            res = helper(res);
        }

        return res;
    }

    public String helper(String str) {
        StringBuilder sb = new StringBuilder();
        char previous = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == previous) {
                count++;
            } else {
                sb.append(count);
                sb.append(previous);
                previous = str.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(previous);

        return sb.toString();
    }
}