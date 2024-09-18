public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
    }
    public static boolean hasTeen(int a, int b, int c) {
        if(13 <= a && a <= 19){
          return true;
        }else if (13 <= b && b <= 19){
          return true;
        }else if (13 <= c && c <= 19){
          return true;
        }else{
          return false;
        }
      }
}
