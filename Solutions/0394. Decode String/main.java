import java.util.Stack;

public class main {
    public static void main(String[] args) {
        
    }

    public String decodeString(String s) {
        Stack<Integer> freqStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        StringBuilder currentStr = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (Character.isLetter(ch)) {
                currentStr.append(ch);
            } else if (ch == '[') {
                freqStack.push(k);
                strStack.push(currentStr);
                k = 0;
                currentStr = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder temp = currentStr;
                int freq = freqStack.pop();
                currentStr = strStack.pop();
                while (freq --> 0) {
                    currentStr.append(temp);
                }
                k = 0;
            }
        }

        return currentStr.toString();
    }
}