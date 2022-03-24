public class main {
    public static void main(String[] args) {
        
    }

    static boolean containsDuplicate(int[] nums) {
        insertion(nums);
        for (int k = 0; k < nums.length - 1; k++) {
            if (nums[k] == nums[k+1]) {
                return true;
            }
        }
        return false; 
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}