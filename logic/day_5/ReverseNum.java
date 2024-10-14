package day_5;

public class ReverseNum {
    public static void main(String[] args) {
        int[][] reverse = reverNum(5);
        for(int[] i: reverse){
            for(int j: i){
                if(j <10){
                    System.out.print(" " + j + " ");
                }else{
                    System.out.print(j + " ");
                }
                
            }
            System.out.println();
        }
    }
    public static int[][] reverNum(int n){
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result[i][j] = ((n-i) * n) -  j; 
            }
        }
        return result;
    }
}
