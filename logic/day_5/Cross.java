package day_5;

public class Cross {
    public static void main(String[] args) {
        String[][] crossing = crossx(5);
        for(String[] i: crossing){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static String[][] crossx(int n){
        String[][] result = new String[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n-1){
                    result[i][j] = "* ";
                }else{
                    result[i][j] = "  ";
                }
            }
        }
        return result;
    }
}
