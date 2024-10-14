public class MonkeyTrouble {
    public static void main(String[] args) {
        boolean aSmile = true;
        boolean bSmile = false;
        System.err.println(monkeyTrouble(aSmile, bSmile));
    }   
    
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
          return true;
        }else{
          return false;
        }
      }
}
