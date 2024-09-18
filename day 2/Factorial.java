
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int num1 = inputScanner.nextInt();
        inputScanner.close();
        System.out.println(factorial(num1));
    }

    public static int factorial(int num){
        if(num == 0){
            return 0;
        }
        if(num > 1){
            return num * factorial(num - 1);
        }else{
            return 1;
        }
    }
        
}

