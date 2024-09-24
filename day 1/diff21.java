public class diff21{
    public static void main(String[] args) {
        System.out.println(Diff21(32));
    }
    public static int Diff21(int n) {
        if(n > 21){
          return 2 * (n - 21);
        }else{
          return 21-n;
        }
      }
}