import java.util.Stack;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(m * n), m -> length of s, n -> length of part
    // SC: O(m), m -> length of s
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();

        int len = part.length();
        char[] temp = new char[len];

        for (char ch : s.toCharArray()) {
            stack.push(ch);

            if (stack.size() >= len && stack.peek() == part.charAt(len - 1)) {
                int j = len - 1;
                while (j >= 0) {
                    temp[j] = stack.pop();
                    j--;
                }

                if (!new String(temp).equals(part)) {
                    for (char tc : temp) {
                        stack.push(tc);
                    }
                }
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }
}
