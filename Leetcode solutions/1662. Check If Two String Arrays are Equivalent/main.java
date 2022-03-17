public class main {
    public static void main(String[] args) {
        
    }

    // * BRUTEFORCE
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = makeString(word1);
        String s2 = makeString(word2);

        return s1.equals(s2);
    }

    public String makeString(String[] word) {
        StringBuilder sb = new StringBuilder();

        for (String s : word) {
            sb.append(s);
        }

        return sb.toString();
    }

    // * OPTIMIZED
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        int arrIndex1 = 0, arrIndex2 = 0;
        int index1 = 0, index2 = 0;

        while (arrIndex1 < word1.length && arrIndex2 < word2.length) {
            if (word1[arrIndex1].charAt(index1) != word2[arrIndex2].charAt(index2)) {
                return false;
            }
            index1++;
            index2++;

            if (index1 == word1[arrIndex1].length()) {
                index1 = 0;
                arrIndex1++;
            }

            if (index2 == word1[arrIndex2].length()) {
                index2 = 0;
                arrIndex2++;
            }
        }

        return arrIndex1 == word1.length && arrIndex2 == word2.length;
    }
}