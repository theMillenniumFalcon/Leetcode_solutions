public class main {
    public static void main(String[] args) {
        
    }

    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            char c = s.charAt(i);
            arr[indices[i]] = c;
        }

        return String.valueOf(arr);
    }
}