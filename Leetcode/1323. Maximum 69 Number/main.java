public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of number
    // SC: O(n), n -> length of number
    public int maximum69Number(int num) {
        char[] charArray = String.valueOf(num).toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '6') {
                charArray[i] = '9';
                break;
            }
        }

        return Integer.valueOf(String.valueOf(charArray));
    }
}