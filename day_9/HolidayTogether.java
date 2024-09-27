package day_9;

import java.time.LocalDate;
import java.util.Scanner;

public class HolidayTogether {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        System.out.print("Mary libur setiap  = ");
        int num1 = InputScanner.nextInt();
        System.out.print("Susan libur setiap = ");
        int num2 = InputScanner.nextInt();
        System.out.println("Terakhir libur bersama :");
        System.out.print("Tanggal \t= ");
        int date = InputScanner.nextInt();
        System.out.print("No. Bulan \t= ");
        int month = InputScanner.nextInt();
        System.out.print("Tahun \t\t= ");
        int year = InputScanner.nextInt();
        InputScanner.close();

        LocalDate togetherDate = LocalDate.of(year, month, date);
        int together;

        if (num1 % num2 == 0) {
            together = num1;
        }else if(num2 % num1 == 0){
            together = num2;
        }else{
            together = (num1 < num2) ? num2 : num1;
            while(true){
                if(together % num1 == 0 && together % num2 == 0){
                    break;
                }
                together +=1;
            }
        }
        LocalDate finalDate = togetherDate.plusDays(together);
        System.out.println("Mary dan Susan akan libur bersama pada " + finalDate);
    }
}
