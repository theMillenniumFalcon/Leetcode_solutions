public class main {
    public static void main(String[] args) {
        
    }

    // TC : O(n)
    // SC: O(1)
    public int[] twoSum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = numbers.length - 1;
        int num1, num2;

        while (pointer1 < pointer2) {
            num1 = numbers[pointer1];
            num2 = numbers[pointer2];

            if (num1 + num2 == target) break;

            if (num1 + num2 < target) {
                pointer1++;
                continue;
            }
            pointer2--;
        }

        return new int[]{pointer1 + 1, pointer2 + 1};
    }
}
