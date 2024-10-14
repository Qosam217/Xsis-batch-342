
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Jumlah baris fibonacci = ");
        int n = inputScanner.nextInt();
        inputScanner.close();
        if(n >= 0){
            System.out.print(0 + " ");
        }
        if(n >= 1){
            System.out.print(1 + " ");
        }
        if(n > 2){
            int num1 = 0;
            int num2 = 1;
            int num3;
            for (int i = 2; i < n; i++){
                num3 = num1 + num2;
                System.out.print(num3 + " ");
                num1 = num2;
                num2 = num3;
            }    
        }
    }
}
