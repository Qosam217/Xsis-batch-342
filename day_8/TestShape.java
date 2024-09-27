package day_8;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        CalShape shape = new CalShape();
        String sep = "=";

        while (true) { 
            System.out.println("\n" + sep.repeat(75));
            System.out.println("Perhitungan Bangun Datar");
            System.out.println("Masukkan Tipe \n (1. Persegi)" + 
                            " \t\t\t (2. Persegi Panjang)" + 
                            " \n (3. Segitiga Siku-siku)" + 
                            " \t (4. Segitiga Sama Kaki)" + 
                            " \n (5. Lingkaran)" + 
                            " \t\t (6. Jajar Genjang)" + " \n (0. Exit)");
            System.out.print("Tipe bangun datar : ");
            int type = InputScanner.nextInt();
            if(type == 0){
                InputScanner.close();
                System.out.println("Turning Off");
                break;
            }else if(type >= 1 && type <= 6){
                shape.setTypeShape(type);
                System.out.println("\n" + sep.repeat(75));
                System.out.println(shape.getTypeShape());
                switch (type) {
                    case 1 :
                        System.out.print("Sisi = ");
                        float side = InputScanner.nextFloat();
                        shape.setVertical(side);
                        shape.setHorizontal(side);
                        break;
                    case 2 :
                        System.out.print("Tinggi = ");
                        shape.setVertical(InputScanner.nextFloat());
                        System.out.print("Lebar = ");
                        shape.setHorizontal(InputScanner.nextFloat());
                        break;
                    case 3:
                        System.out.print("Tinggi = ");
                        shape.setVertical(InputScanner.nextFloat());
                        System.out.print("Alas = ");
                        shape.setHorizontal(InputScanner.nextFloat());
                        System.out.print("Sisi Miring = ");
                        shape.setDiagonal(InputScanner.nextFloat());
                        break;
                    case 4:
                        System.out.print("Tinggi = ");
                        shape.setVertical(InputScanner.nextFloat());
                        System.out.print("Alas = ");
                        shape.setHorizontal(InputScanner.nextFloat());
                        System.out.print("Sisi Miring = ");
                        shape.setDiagonal(InputScanner.nextFloat());
                        break;
                    case 5:
                        System.out.print("Jari-jari = ");
                        shape.setRadius(InputScanner.nextFloat());
                        break;
                    case 6:
                        System.out.print("Tinggi = ");
                        shape.setVertical(InputScanner.nextFloat());
                        System.out.print("Alas = ");
                        shape.setHorizontal(InputScanner.nextFloat());
                        System.out.print("Sisi Miring = ");
                        shape.setDiagonal(InputScanner.nextFloat());
                        break;
                }
            }else{
                System.out.println("Mohon masukkan tipe bangun datar");
                continue;
            }
            while (true) { 
                System.out.println("Hitung : (1. Luas) (2. Keliling)");
                System.out.print("Opsi Hitung : ");
                int calculate = InputScanner.nextInt();
                
                if(calculate == 1){
                    System.out.println("Luas = " + shape.calLuas());
                    break;
                }else if(calculate == 2){
                    System.out.println("Keliling = " + shape.calKeliling());
                    break;
                }else{
                    System.out.println("Mohon masukkan opsi hitung");
                }
            }       
        }
    }
}