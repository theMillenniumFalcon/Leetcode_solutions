public class main  {
    public static void main(String[] args) {
        
    }

    // TC : O(n^2)
    // SC: O(1)
    public int maxArea(int[] height) {
        int res = 0;

        for (int l = 0; l< height.length; l++) {
            for (int r = l + 1; r < height.length; r++) {
                int area = (r - l) * Math.min(height[l], height[r]);
                res = Math.max(res, area);
            }
        }

        return res;
    }

    // TC : O(n)
    // SC: O(1)
    public int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}