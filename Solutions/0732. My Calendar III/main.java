import java.util.TreeMap;

class MyCalendarThree {

    TreeMap<Integer, Integer> treeMap;

    public MyCalendarThree() {
        treeMap = new TreeMap<>();
    }

    // TC: O(n^2), n -> number of trees in map
    // SC: O(n), n -> number of trees in map
    public int book(int start, int end) {
        treeMap.put(start, treeMap.getOrDefault(start, 0) + 1);
        treeMap.put(end, treeMap.getOrDefault(end, 0) - 1);

        int activeBookings = 0;
        int maxActiveBookings = 0;

        for (int events : treeMap.values()) {
            activeBookings += events;
            maxActiveBookings = Math.max(activeBookings, maxActiveBookings);
        }

        return maxActiveBookings;
    }
}