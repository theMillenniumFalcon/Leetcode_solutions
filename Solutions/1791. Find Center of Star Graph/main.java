public class main {
    public static void main(String[] args) {

    }

    // TC : O(n), no. of subarrays of size 2 in edges
    // SC: O(1)
    public int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        }

        return edges[0][1];
    }
}