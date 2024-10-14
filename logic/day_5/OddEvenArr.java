package day_5;

public class OddEvenArr {
    public static void main(String[] args) {
        int[][] oeArr = oddEvenArr(5);
        for(int[] i: oeArr){
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
    public static int[][] oddEvenArr(int n){
        int[][] result = new int[n][n];
        int odd = 0;
        int even = 1;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    result[i][j] = odd +1 ;
                    odd += 2;
                }else{
                    result[i][j] = even + 1;
                    even += 2;
                    
                }
                
            }
        }
        return result;
    }
}
