public class Front3 {
    public static void main(String[] args) {
        System.err.println(front3("abcXYZ"));
    }
    public static String front3(String str) {
        String str1;
        if(str.length() < 3){
            str1 = str.substring(0, str.length());
            return str1.repeat(3);
        }else{
            str1 = str.substring(0,3);
            return str1.repeat(3);
        }
      }
}
