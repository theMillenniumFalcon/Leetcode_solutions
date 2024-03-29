import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n*log(n)), n -> number of elments in properties matrix
    // SC: O(1)
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> (a[0] == b[0]) ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]));

        int noOfWeakCharacters = 0;
        int len = properties.length;

        int max = properties[len - 1][1];

        for (int i = len - 2; i >= 0; i--) {
            if (properties[i][1] < max) {
                noOfWeakCharacters++;
            } else {
                max = properties[i][1];
            }
        }

        return noOfWeakCharacters;
    }
}