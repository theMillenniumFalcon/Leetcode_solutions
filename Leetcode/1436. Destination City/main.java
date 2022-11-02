import java.util.*;

public class main {
    public static void main(String[] args) {
        
    }

    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        
        for (List<String> row : paths) {
            set.add(row.get(0));
            set.add(row.get(1));
        }

        for (List<String> row : paths) {
            if (set.contains(row.get(0))) {
                set.remove(row.get(0));
            }
        }

        String ans = "";
        for (String s : set) {
            ans = s;
        }

        return ans;
    }
} 