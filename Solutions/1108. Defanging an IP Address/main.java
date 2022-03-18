public class main {
    public static void main(String[] args) {
        
    }

    public String defangIPaddr(String address) {
        String str = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                str += "[.]";
            } else {
                str += String.valueOf(address.charAt(i));
            }
        }

        return str;
    }
}