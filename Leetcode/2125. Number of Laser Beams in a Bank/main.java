public class main {
    public static void main(String[] args) {

    }

    // TC : O(n * len(String)), n -> length of bank array
    // SC: O(1)
    public int numberOfBeams(String[] bank) {
        int prevDevicesFreq = 0;
        int ans = 0;

        for (String str : bank) {
            int currDevicesFreq = 0;
            for (char ch : str.toCharArray()) {
                if (ch == '1') {
                    currDevicesFreq++;
                }
            }

            if (currDevicesFreq > 0) {
                ans += (currDevicesFreq * prevDevicesFreq);
                prevDevicesFreq = currDevicesFreq;
            }
        }

        return ans;
    }
}