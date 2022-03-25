import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }

        int[] ans = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            ans[index++] = i;
        }

        return ans;
    }
}