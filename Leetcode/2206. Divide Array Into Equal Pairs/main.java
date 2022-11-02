import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return set.isEmpty();
    }
}