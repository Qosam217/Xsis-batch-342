public class CalculateBMI {
    public static void main(String[] args) {
        int height = 140;
        int weight = 55;
        System.out.println(calBMI(height, weight));
    }

    public static String calBMI(float height, float weight){
        float BMI = weight / (height*height);
        String kondisi;
        if (BMI < 18.5){
            kondisi = "Kekurangan berat badan";
        }else if(BMI < 24.9){
            kondisi = "Normal (ideal)";
        }else if(BMI < 29.9){
            kondisi = "Kelebihan berat badan";
        }else{
            kondisi = "Kegemukan (obesitas)";
        }
        return kondisi;
    }
}
