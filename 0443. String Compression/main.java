public class main {
    public static void main(String[] args) {
        
    }

    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            chars[index] = chars[i];
            index++;

            if (j - i > 1) {
                String count = j - i + "";
                for (char ch : count.toCharArray()) {
                    chars[index] = ch;
                    index++;
                }
            }

            i = j;
        }

        return index;
    }
}