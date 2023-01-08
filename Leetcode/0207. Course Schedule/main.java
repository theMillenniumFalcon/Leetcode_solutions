import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {

    }

    // TC: O(N + E)
    // SC: O(N)
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for (int i = 0; i < numCourses; i++) {
            for (int adj : adjList.get(i)) {
                indegree[adj]++;
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            for (int adj : adjList.get(node)) {
                indegree[adj]--;
                if (indegree[adj] == 0) {
                    q.add(adj);
                }
            }
        }
        if (count == numCourses)
            return true;
        else
            return false;
    }
}