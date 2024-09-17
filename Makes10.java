public class Makes10 {
    public static void main(String[] args) {
        System.err.println(makes10(9, 10));
    }

    public static boolean makes10(int a, int b) {
        if(a + b == 10){
          return true;
        }else if(a == 10 || b == 10) {
          return true;
        }else{
          return false;
        }
      }
}
