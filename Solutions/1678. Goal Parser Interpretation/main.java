public class main {
    public static void main(String[] args) {
        
    }

    public String interpret(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                ans += "G";
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans += "o";
                i ++;
            } else {
                ans += "al";
                i += 3;
            }
        }

        return ans;
    }
}