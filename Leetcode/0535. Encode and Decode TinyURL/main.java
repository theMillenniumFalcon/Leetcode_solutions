class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int n = longUrl.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int util = longUrl.charAt(i);
            sb.append(util);
            sb.append("*");
        }

        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int n = shortUrl.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n;) {
            String util = "";
            while (shortUrl.charAt(i) != '*') {
                util += shortUrl.charAt(i);
                i++;
            }
            sb.append((char) (Integer.parseInt(util)));
            i++;
        }
        return sb.toString();
    }
}