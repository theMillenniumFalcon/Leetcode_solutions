public class main {
    public static void main(String[] args) {
        
    }

    public String freqAlphabets(String s) {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] input = s.toCharArray();
        StringBuilder sb = new StringBuilder(input.length);

        int i = 0;
        while (i < input.length) {
            if (i < input.length - 2 && input[i + 2] == '#') {
                int digitTwo = Character.getNumericValue(input[i]) * 10;
                int digitOne = Character.getNumericValue(input[i + 1]);

                int combNum = digitTwo + digitOne;

                char letterEquv = alpha[combNum - 1];

                sb.append(letterEquv);

                i = i + 3;

            } else {
                int num = Character.getNumericValue(input[i]);
                char letterEquv = alpha[num - 1];
                sb.append(letterEquv);
                i++;
            }
        }

        return sb.toString();
    }
}