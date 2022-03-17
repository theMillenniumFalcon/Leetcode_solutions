public class main {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // * -------------------OR-------------------

    public int strStr2(String haystack, String needle) {
        if (needle.length() == 0 || needle == "") {
            return 0;
        }

        // with haystack.length() - needle.length() + 1, we would start at every position including "o", which is useless
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String str = haystack.substring(i, i + needle.length());
            if (str.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}