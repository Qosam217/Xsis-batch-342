package day_3;

import java.util.Scanner;

public class GetDayNumber {
    
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);

        System.out.print("Masukkan nama hari : ");
        String nowDay = InputScanner.nextLine();
        aroundDay(nowDay);

        InputScanner.close();
    }
    public static String dayName(int num){
        String result = "ERROR";
        switch(num % 7){
            case 1:
                result = "Senin";
                break;
            case 2:
                result = "Selasa";
                break;
            case 3:
                result = "Rabu";
                break;
            case 4:
                result = "Kamis";
                break;
            case 5:
                result = "Jumat";
                break;
            case 6:
                result = "Sabtu";
                break;
            case 0:
                result = "Minggu";
                break;
        }
        return result;
    }
    public static int dayNumber(String days){
        Scanner InputScanner = new Scanner(System.in);
        
        InputScanner.close();

        int result = 0;
        switch (days.toLowerCase()) {
            case "senin":
                result = 1;
                break;
            case "selasa":
                result = 2;
                break;
            case "rabu":
                result = 3;
                break;
            case "kamis":
                result = 4;
                break;
            case "jumat":
                result = 5;
                break;
            case "sabtu":
                result = 6;
                break;
            case "minggu":
                result = 7;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public static void aroundDay(String now){
        int numDay = dayNumber(now);
        if(numDay == 0){
            System.out.println("INVALID DAY");
        }else{
            System.out.println("Kemarin lusa adalah hari " + dayName(numDay - 2 +7));
            System.out.println("Kemarin adalah hari " + dayName(numDay-1 +7));
            System.out.println("Hari ini adalah hari " + dayName(numDay));
            System.out.println("Besok adalah hari " + dayName(numDay + 1));
            System.out.println("Besok lusa adalah hari " + dayName(numDay + 2));
        }
    }
}
