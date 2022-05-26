import java.util.*;

class Pair {
    int value1;
    int value2;

    Pair(int a, int b) {
        value1 = a;
        value2 = b;

    }
}

class DetectSquares {
    Map<Pair<Integer, Integer>, Integer> map;
    List<int[]> lists;

    public DetectSquares() {
        map = new HashMap<>();
        lists = new ArrayList<>();
    }

    public void add(int[] point) {
        Pair temp = new Pair<>(point[0], point[1]);
        map.put(temp, map.getOrDefault(temp, 0) + 1);
        lists.add(point);
    }

    public int count(int[] point) {

    }
}
