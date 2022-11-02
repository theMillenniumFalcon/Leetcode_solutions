public class main {
    public static void main(String[] args) {
        
    }

    public String capitalizeTitle(String title) {
        String[] strings = title.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : strings) {
            if (s.length() <= 2)
                s = s.toLowerCase();
            else {
                s = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
            }

            stringBuilder.append(s).append(' ');
        }

        return new String(stringBuilder).trim();
    }
}