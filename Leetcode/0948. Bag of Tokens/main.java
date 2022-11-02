import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n * log(n))
    // SC: O(1)
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int len = tokens.length;

        for (int i = 0; i < len; i++) {
            if (tokens[i] <= power) {
                power -= tokens[i];
                score++;
            } else if (tokens[i] >= power && score >= 1 && i != len - 1) {
                power += tokens[len - 1];
                score--;
                i--;
                len--;
            } else {
                break;
            }
        }

        return score;
    }
}