public class InRange {
    public static void main(String[] args) {
        int num1 = 32;
        int num2 = 62;
        System.out.println(inRange(num1, num2));
    }

    public static boolean inRange(int n1, int n2){
        if(n1 >= 30 && n1 <= 50){
            if(n2 >= 30 && n2 <= 50){
                return true;
            }
        }
        return false;
    }
}
