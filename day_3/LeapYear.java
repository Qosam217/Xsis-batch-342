package day_3;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);

        System.out.print("Masukkan tahun = ");
        int reqYear = InputScanner.nextInt();

        InputScanner.close();
        leapYear(reqYear);
    }
    public static void leapYear(int year){
        int nowYear = Year.now().getValue();
        System.out.println("Tahun Kabisat antara " + year +" dengan "+ nowYear +" :");
        
        for(int i = year ; i <= nowYear ; i++){
            if (i % 4 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
