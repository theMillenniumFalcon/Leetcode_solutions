public class main {
    public static void main(String[] args) {
        
    }

    public boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) return true;
        if (name.length() > typed.length()) return false;

        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }

        return i == name.length();
    }
}