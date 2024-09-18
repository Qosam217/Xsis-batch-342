public class MissingChar {
    public static void main(String[] args) {
        System.err.println(missingChar("kitten", 1));
    }
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n+1, str.length());
      }
}
