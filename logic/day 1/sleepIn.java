public class sleepIn{
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = true;
        boolean canSleep = sleep(weekday, vacation);
        System.out.println(canSleep);
    }

    public static boolean sleep(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true){
          return true;
        }else{
          return false;
        }
      }
}
