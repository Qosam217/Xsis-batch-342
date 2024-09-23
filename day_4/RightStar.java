package day_4;

import java.util.Scanner;

public class RightStar {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris = ");
        int n = InputScanner.nextInt();
        InputScanner.close();
        rightTriange(n);
    }
    
    public static void rightTriange(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <=num; j++){
                if(num-j+1 <= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println("");
        }
    }
}
