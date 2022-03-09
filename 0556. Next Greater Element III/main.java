public class main {
    public static void main(String[] args) {
        
    }

    public int nextGreaterElement(int n) {
         char[] ch = ("" + n).toCharArray();
         int i = ch.length - 2;
         while (i >= 0 && ch[i] >= ch[i + 1]) {
             i--;
         }

         if (i == -1) return -1;

         int j = ch.length - 1;
         while (j > 1 && ch[j] <= ch[i]) {
             j--;
         }

         swap(ch, i, j);
         reverse(ch, i + 1);

         try {
             return Integer.parseInt(new String(ch));
         } catch(Exception e) {
             return -1;
         }

    }

    public void reverse(char[] ch, int start) {
        int l = start;
        int r = ch.length - 1;
        while (l < r) {
            swap (ch, l, r);
            l++;
            r--;
        }
    }

    public void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}