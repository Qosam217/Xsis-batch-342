package day_3;

import java.util.Scanner;

public class OddEvenAddition {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Iterasi = ");
        int num = InputScanner.nextInt();
        InputScanner.close();
        addition(num);
    }
    public static void addition(int iter){
        for(int i = 1; i < iter*2; i+=2){
            int even = i + 1;
            int result = i + even;
            System.out.println(i + " + " + even + " = " + result);
        }
    }
}
