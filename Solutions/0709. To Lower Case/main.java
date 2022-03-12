public class main {
    public static void main(String[] args) {
        
    }

    public String toLowerCase(String s) {
        String result = "";
        for (char ch: s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result = result + (char)(ch + 32);
            } else {
                result = result + ch;
            }
        }

        return result;
    }
}