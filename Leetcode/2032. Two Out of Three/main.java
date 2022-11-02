import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
            if (set1.contains(i)) {
                if (!list.contains(i)) {
                    list.add(i);
                }
            }
        }

        for (int i : nums3) {
            if ((set1.contains(i) || set2.contains(i)) && (!list.contains(i))) {
                list.add(i);
            }
        }

        return list;
    }
}