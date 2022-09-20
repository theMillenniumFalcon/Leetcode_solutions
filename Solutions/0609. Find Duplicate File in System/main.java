import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(n), n -> length of paths
    // SC: O(k), k -> different types of content
    public List<List<String>> findDuplicate(String[] paths) {
        // <Content, List<FilePaths>>
        Map<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] dir = path.split(" ");
            String rootPath = dir[0];

            for (int i = 1; i < dir.length; i++) {
                // 1.txt(abcd)
                String content = dir[i].substring(dir[i].indexOf("("), dir[i].indexOf(")"));

                if (!map.containsKey(content)) {
                    map.put(content, new ArrayList<>());
                }

                map.get(content).add(rootPath + "/" + dir[i].substring(0, dir[i].indexOf("(")));

            }
        }

        List<List<String>> res = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                res.add(entry.getValue());
            }
        }

        return res;
    }
}