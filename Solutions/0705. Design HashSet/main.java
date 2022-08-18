import java.security.DrbgParameters.Capability;
import java.util.LinkedList;
import java.util.List;

// TC : O(n)
// SC: O(10^6)
class MyHashSet {

    boolean[] set = null;

    public MyHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

// TC : O(n)
// SC: O(1)

// HashSet => 4(1), 10(2), 16(1), 17(3)
/*
 * Hash
 * 1 -> 4 -> 16 -> ...
 * 2 -> 10 -> ...
 * 3 -> 17 -> ...
 */
class MyHashSet2 {

    private int hashSetCapacity;
    private List<Integer>[] set;

    public MyHashSet2() {
        hashSetCapacity = 1500;
        set = new List[hashSetCapacity];
    }

    private int getKeyHash(int key) {
        return key % hashSetCapacity;
    }

    public void add(int key) {
        int hashIndex = getKeyHash(key);
        if (set[hashIndex] == null) {
            set[hashIndex] = new LinkedList<>();
        }

        if (set[hashIndex].indexOf(key) == -1) {

        }
    }

    public void remove(int key) {

    }

    public boolean contains(int key) {
        return set[key];
    }
}