import java.util.TreeMap;

class MyCalendar {

    TreeMap<Integer, Integer> treeMap;

    public MyCalendar() {
        treeMap = new TreeMap<>();
    }

    // TC: O(log(n)), n -> number of enntriws in tree map
    // SC: O(n), n -> number of enntriws in tree map
    public boolean book(int start, int end) {
        if (treeMap.floorEntry(start) != null && start < treeMap.floorEntry(start).getValue()) {
            return false;
        }

        if (treeMap.ceilingEntry(start) != null && end > treeMap.ceilingEntry(start).getKey()) {
            return false;
        }

        treeMap.put(start, end);

        return true;
    }
}
