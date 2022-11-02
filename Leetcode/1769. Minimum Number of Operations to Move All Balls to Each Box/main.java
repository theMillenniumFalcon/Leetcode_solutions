public class main {
    public static void main(String[] args) {

    }

    // TC : O(n^2), n -> length of input string
    // SC: O(1)
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (boxes.charAt(j) == '1') {
                    arr[i] += Math.abs(i - j);
                }
            }
        }
        return arr;
    }
}