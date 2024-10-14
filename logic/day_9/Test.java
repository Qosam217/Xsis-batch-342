package day_9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        System.out.print("Masukkan nilai = ");
        if(InputScanner.hasNextInt()){
            int num = InputScanner.nextInt();
            System.out.println("Integer type = " + num);
        }else{
            System.out.println("Other type");
        }
    }
}
