import java.util.Stack;

public class main {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == ' ') {
                reverse(ch, i, j - 1);
                i = j + 1;
            }
        }
        reverse(ch, i, ch.length - 1);

        return new String(ch);
    }

    public void reverse(char[] ch, int i, int j) {
        while (i <= j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }
    }
}