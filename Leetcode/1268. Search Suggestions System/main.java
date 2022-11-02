import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n*log(n)), n -> length of products
    // SC: O(n), n -> length of products
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);

        List<List<String>> res = new ArrayList<>();

        for (int i = 1; i <= searchWord.length(); i++) {
            String temp = searchWord.substring(0, i);
            List<String> list = new ArrayList<>();
            int count = 0;

            for (String word : products) {
                String temp2 = null;
                if (i <= word.length()) {
                    temp2 = word.substring(0, i);
                }
                if (temp.equals(temp2)) {
                    list.add(word);
                    count++;
                }
                if (count == 3) {
                    break;
                }
            }
            res.add(list);
        }

        return res;
    }
}