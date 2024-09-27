package day_9;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineDelivery {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        ArrayList<Integer> nationalHolidays = new ArrayList<Integer>();

        System.out.print("Tanggal = ");
        int date = InputScanner.nextInt();
        System.out.print("Dalam seminggu, Hari ke- ");
        int day = InputScanner.nextInt();
        System.out.println("Hari Libur Nasional (masukkan 0 jika selesai)");
        int holiday;
        while (true) { 
            System.out.print("Tanggal = ");
            holiday = InputScanner.nextInt();
            if(holiday == 0){
                break;
            }else{
                nationalHolidays.add(holiday);
            }
        }
        InputScanner.close();

        int delivery = 7;
        for (int i = 0; i < delivery; i++) {
            date += 1;
            day += 1;
            if(nationalHolidays.contains(date) && date < 31){
                delivery += 1;
            }else if(day % 7 == 0){
                day = 0;
                delivery += 1;
            }else if(day % 6 == 0){
                delivery += 1;

            }
        }

        if(date > 31){
            date = date % 31;
            System.out.println("Pesanan sampai tanggal " + date + " di bulan berikutnya");
        }else{
            System.out.println("Pesanan sampai tanggal " + date);
        }
    }
}