public class Front3 {
    public static void main(String[] args) {
        System.err.println(front3("abcXYZ"));
    }
    public static String front3(String str) {
        if(str.length() < 3){
          return str.substring(0, str.length()) + str.substring(0, str.length()) + str.substring(0, str.length()) ;
        }else{
          return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
        }
      }
}
