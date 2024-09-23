package day_5;

public class Outer {
    public static void main(String[] args) {
        String[][] square = outer(5);
        for(String[] i: square){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static String[][] outer(int n){
        String[][] result = new String[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || j == n-1 || i == 0 || i == n-1){
                    result[i][j] = "* ";
                }else{
                    result[i][j] = "  ";
                }
            }
        }
        return result;
    }
}
