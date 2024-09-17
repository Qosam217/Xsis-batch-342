public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 7));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking == true && hour > 20){
          return true;
        }else if(talking == true && hour < 7){
          return true;
        }else{
          return false;
        }
      }
}
