import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int  mergeSort(int[] nums, int low, int high) {
        if (low >= high) return 0;
        int mid = (low + high) / 2;
        int inv = mergeSort(nums, low, mid);
        inv += mergeSort(nums, mid + 1, high);
        inv += merge(nums, low, mid, high);
        return inv;
    }

    public int merge(int[] nums, int low, int  mid, int high) {
        int count = 0;
        int j = mid + 1;
        for (int i = low; i<= mid; i++) {
            while (j <= high && nums[i] > (2 * (long)nums[j])) {
                j++;
            }
            count += (j - (mid + 1));
        }

        ArrayList<Integer> list = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                list.add(nums[left + 1]);
            } else {
                list.add(nums[right++]);
            }
        }

        while (left <= mid) {
            list.add(nums[left++]);
        }
        while (right <= high) {
            list.add(nums[right++]);
        }

        for (int i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }

        return count;
    }
}