public class main {
    public static void main(String[] args) {
        String result = "nishank";
        System.out.println(result.indexOf("p"));
    }

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }

        String reverseStr = reverse(word.substring(0, index + 1));

        return reverseStr.concat(word.substring(index + 1));
    }

    public String reverse(String str) {
        String newStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newStr = ch + newStr; 
        }

        return newStr;
    }
    
}
