import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

    }

    // TC : O(n * m * log(m)), n -> the max number of words we can receive in
    // "strs"; m -> largest size a word in "strs" can be
    // SC: O(n), n -> the max number of words we can receive in
    // "strs"
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        if (strs.length == 0) {
            return res;
        }
        for (String current : strs) {
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(current);
        }
        res.addAll(map.values());

        return res;
    }
}