public class Reverser {
    public static String reverse(String text) {
        char tmp[] = text.toCharArray();

        int n = text.length();
        for(int i = 0; i < n/2; i++) {
            char t = tmp[i];
            tmp[i] = tmp[n-i-1];
            tmp[n-i-1] = t;
        }

        return new String(tmp);
    }
}