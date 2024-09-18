public class SumDouble {
    public static void main(String[] args) {
        System.err.println(sumDouble(0, 0));
    }
    public static int sumDouble(int a, int b) {
        if(a != b){
          return a+b;
        } else{
          return 4 * a;
        }
      }
}
