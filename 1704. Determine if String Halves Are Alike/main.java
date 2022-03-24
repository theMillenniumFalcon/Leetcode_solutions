import java.util.Set;

public class main {
    public static void main(String[] args) {
        
    }

    public boolean halvesAreAlike(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;
        int leftCunt = 0, rightCunt = 0;
        Set vowels = Set.of ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        while (left < right) {
            leftCunt += vowels.contains(ch[left]) ? 1 : 0;
            rightCunt += vowels.contains(ch[right]) ? 1 : 0;

            left ++;
            right --;
        }

        return leftCunt == rightCunt;
    }
}