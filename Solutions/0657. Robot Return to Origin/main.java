public class main {
    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        int UpDown = 0;
        int LeftRight = 0;

        for (int i = 0; i < moves.length(); i++) {
            char currentMove = moves.charAt(i);
            if (currentMove == 'U') {
                UpDown++;
            } else if (currentMove == 'D') {
                UpDown--;
            } else if (currentMove == 'L') {
                LeftRight++;
            } else if (currentMove == 'R') {
                LeftRight--;
            }
        }

        return UpDown == 0 && LeftRight == 0;
    }
}