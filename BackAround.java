public class BackAround {
    public static void main(String[] args) {
        System.err.println(backAround("cat"));
    }
    public static String backAround(String str) {
        return str.substring(str.length()-1, str.length()) + str + str.substring(str.length()-1, str.length());
      }
}
