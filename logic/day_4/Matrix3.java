package day_4;

import java.util.Scanner;

public class Matrix3 {
    public static void main(String[] args) {
        String[][] matx = matrix3();
        for(String[] i: matx){
            for(String j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static String[][] matrix3(){
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Jumlah Baris = ");
        int num1 = inputScanner.nextInt();
        
        System.out.print("Jumlah kolom = ");
        int num2 = inputScanner.nextInt();
        
        inputScanner.close();
        String[][] mat = new String[num1][num2];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = "* ";
            }
        }
        return mat;
    }


}