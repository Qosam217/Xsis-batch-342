package day_9;

public class AMPM {
    public static void main(String[] args) {
        String str = "21:00";
        System.out.println(convert(str));
        String str2 = "3:00 AM";
        System.out.println(convert(str2));
        String str3 = "6:00 PM";
        System.out.println(convert(str3));
    }
    public static String convert(String clock){
        String result;
        Integer num;
        String[] splitClock = clock.replace(":", " ").split(" ");
        result = splitClock[0];
        if(splitClock.length == 3){
            num = Integer.parseInt(splitClock[0]);
            if(splitClock[2].toLowerCase().equals("pm")){
                num += 12;
            }
            result =  Integer.toString(num) + ":" + splitClock[1];
            
        }else if (splitClock.length == 2) {
            num = Integer.parseInt(splitClock[0]);
            if(num > 12){
                num = num % 12;
                result =  Integer.toString(num) + ":" + splitClock[1] + " PM";
            }else{
                result =  Integer.toString(num) + ":" + splitClock[1] + " AM";
            }
        } else {
        }
        return result;   
    }
}
