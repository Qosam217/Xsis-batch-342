public class MaxMin {
    public static void main(String[] args) {
        int[] cal = maxMin(5, -9, 10000, 0);
        System.out.println("Nilai maksimal " + cal[0]);
        System.out.println("Nilai minimal " + cal[0]);
    }
    public static int[] maxMin(int a, int b, int c, int d){
        int[] result = new int[2];
        int[] comparison = {a, b, c, d};
        int max = a;
        int min = a;
        for(int i : comparison){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        result[0] = max;
        result[1] = min;
        return result;
    }
}
