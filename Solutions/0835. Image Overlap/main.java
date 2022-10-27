public class main {
    public static void main(String[] args) {

    }

    // TC: O(n^2)
    // SC: O(1)
    public int largestOverlap(int[][] img1, int[][] img2) {
        int maxCount = 0;
        int len = img1.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                maxCount = Math.max(maxCount, getMatchCount(img1, img2, i, j));
                maxCount = Math.max(maxCount, getMatchCount(img2, img1, i, j));
            }
        }

        return maxCount;
    }

    public int getMatchCount(int[][] A, int[][] B, int startAI, int startAJ) {
        int len = A.length;
        int startBI = 0;
        int startBJ = 0;

        int left = 0;
        int right = 0;

        for (int i = startAI; i < len; i++) {
            startBJ = 0;
            for (int j = startAJ; j < len; j++) {
                if (A[i][j] == 1 && A[i][j] == B[startBI][startBJ]) {
                    left++;
                }

                if (A[i][startBJ] == 1 && A[i][startBJ] == B[startBI][j]) {
                    right++;
                }
                startBJ++;
            }
            startBI++;
        }
        return Math.max(left, right);
    }
}