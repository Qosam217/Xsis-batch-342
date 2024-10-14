package day_8;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        int operation = 5;
        System.out.println("Kalkulator");
        String sep = "=";
        Scanner InputScanner = new Scanner(System.in);

        while (true) { 
            try {
                System.out.println("\n" + sep.repeat(75));
                System.out.println("Pilih operasi: (1. Jumlah) (2. Kurang) (3.Kali) (4. Bagi) (5. Exit)");
                System.out.print("Operasi : ");
                operation = InputScanner.nextInt();
            } catch (Exception e) {
                InputScanner.nextLine();
                System.out.println("Silahkan pilih Operasi");
                continue;
            }
            
            if(operation == 5){
                System.out.print("Turning Off Calculator");
                InputScanner.close();
                break;
            }else if(operation >= 1 && operation <= 4){
                System.out.print("Masukkan angka = ");
                float num1 = InputScanner.nextFloat();
                System.out.print("Masukkan angka = ");
                float num2 = InputScanner.nextFloat();

                Calculator calc = new Calculator();
                calc.setNumber(num1, num2);
                switch (operation) {
                    case 1:
                        calc.plus();
                        break;
                    case 2:
                        calc.minus();
                        break;
                    case 3:
                        calc.times();
                        break;
                    case 4:
                        calc.divide();
                        break;
                }
            }else{
                System.out.println("Pilih operasi");
                continue;
            }
            
        }
    }    
}
