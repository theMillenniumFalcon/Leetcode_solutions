public class main {
    public static void main(String[] args) {

    }

    // * BRUTEFORCE
    public boolean checkPalindromeFormation(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (isPalindrome(a.substring(0, i) + b.substring(i)) || isPalindrome(b.substring(0, i) + a.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return l >= r;
    }

    // * OPTIMIZED
    public boolean checkPalindromeFormation2(String a, String b) {
        return check(a, b) || check(b, a);
    }

    public boolean check(String a, String b) {
        int i = 0, j = b.length() - 1;
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        if (i >= j) return true;
        return checkPalindrome(a.substring(i, j + 1)) || checkPalindrome(b.substring(i, j + 1));
    }

    public boolean checkPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return l >= r;
    }
}