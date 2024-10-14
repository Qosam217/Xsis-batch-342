package day_4;

import java.util.Scanner;

public class Matrix2 {
    
    public static void main(String[] args) {
        String[][] matx = matrix2();
        for(String[] i: matx){
            for(String j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static String[][] matrix2(){
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Jumlah Baris = ");
        int row = inputScanner.nextInt();
        
        System.out.print("Jumlah kolom = ");
        int col = inputScanner.nextInt();
        
        inputScanner.close();
        String[][] mat = new String[row][col];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = "["+i+","+j+"]";
            }
        }
        return mat;
    }


}
