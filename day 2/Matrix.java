
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(matrix()));
        int[][] matx = matrix();
        for(int[] i: matx){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrix(){
        Scanner inputScanner = new Scanner(System.in);
        Random rn = new Random();
        
        System.out.print("Dimensi 1 = ");
        int num1 = inputScanner.nextInt();
        
        System.out.print("Dimensi 2 = ");
        int num2 = inputScanner.nextInt();
        
        inputScanner.close();
        int[][] mat = new int[num1][num2];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = rn.nextInt(9);
            }
        }
        return mat;
    }
}
