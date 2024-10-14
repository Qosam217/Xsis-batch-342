package day_4;

import java.util.Scanner;

public class LeftStar {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris = ");
        int n = InputScanner.nextInt();
        InputScanner.close();
        leftTriange(n);
    }
    
    public static void leftTriange(int num){
        for(int i = 1; i <= num+1; i++){
            for(int j = 1; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
