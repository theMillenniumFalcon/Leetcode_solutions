import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n * log(n) + n * k + m), n -> length of products, k -> average length
    // of words in products, m -> length of searchWord
    // SC: O(n)
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList<>();

        int left = Integer.parseInt(products[0]);
        int right = Integer.parseInt(products[products.length - 1]);

        for (char ch : searchWord.toCharArray()) {
            while (left <= right && products[left].length() <= ch) {

            }
        }

        return res;
    }
}