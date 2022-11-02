import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class meeting {
    int start;
    int end;
    int position;

    public meeting(int start, int end, int position) {
        this.start = start;
        this.end = end;
        this.position = position;
    }
}

class meetingComparator implements Comparator<meeting> {
    @Override
    public int compare(meeting m1, meeting m2) {
        if (m1.end < m2.end) {
            return -1;
        } else if (m1.end > m2.end) {
            return 1;
        } else if (m1.position < m2.position) {
            return -1;
        }
        return 1;
    }
}

// TC: O(n * log(n))
// SC: O(n)
class Solution {
    public static int maxMeetings(int start[], int end[], int n) {
        ArrayList<meeting> list = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            list.add(new meeting(start[i], end[i], i + 1));
        }

        meetingComparator obj = new meetingComparator();
        Collections.sort(list, obj);

        ArrayList<Integer> res = new ArrayList<>();
        res.add(list.get(0).position);
        int endLimit = list.get(0).end;

        for (int i = 0; i < start.length; i++) {
            if (list.get(i).start > endLimit) {
                endLimit = list.get(i).end;
                res.add(list.get(i).position);
            }
        }

        return res.size();
    }
}