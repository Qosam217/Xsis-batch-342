public class nearHundred {
    public static void main(String[] args) {
        System.out.println(NearHundred(93));
    }
    public static boolean NearHundred(int n) {
        if(Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10){
          return true;
        }else{
          return false;
        }
      }
}
