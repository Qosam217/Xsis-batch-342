package day_4;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        String[][] matx = matrix1();
        for(String[] i: matx){
            for(String j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    public static String[][] matrix1(){
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Parameter Matrix = ");
        int num = inputScanner.nextInt();
        inputScanner.close();
        String[][] mat = new String[num][num];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = "["+i+","+j+"]";
            }
        }
        return mat;
    }


}
