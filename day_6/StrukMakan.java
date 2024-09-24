package day_6;

import java.util.ArrayList;
import java.util.Scanner;

public class StrukMakan {
    public static void main(String[] args) {
        
        Scanner InputScanner = new Scanner(System.in);
        System.out.println("Daftar pesan tempat :");
        System.out.println("(kategori) = (jumlah) orang");
        System.out.println("Kategori : Laki-laki Dewasa, Perempuan Dewasa, Remaja, Anak-anak, dan Balita");
        System.out.println("Ketik Done jika selesai\n");
        
        ArrayList<String> data = new ArrayList<String>();
        while (true) { 
            String sum = InputScanner.nextLine().toLowerCase();
            if(sum.contains("laki-laki dewasa") ||
            sum.contains("perempuan dewasa") ||
            sum.contains("remaja") ||
            sum.contains("anak-anak") ||
            sum.contains("balita") && sum.contains(" = ")){
                data.add(sum);
            }else if(sum.equals("done")){
                break;
            }else{
                System.out.println("\nERROR");
                System.out.println("Isi dengan format berikut \n(kategori) = (jumlah) orang\n");
            }
        }
        InputScanner.close();
        System.out.println("\nJumlah Porsi = " + calPorsi(data));


    }
    public static float calPorsi(ArrayList<String> order){
    float result = 0;
    int nambah = 0;
    int sumPeople = 0;
    // 1 dewasa lk -> 2
    // 1 dewasa pr -> 1
    // 2 remaja -> 2
    // 1 anak -> 1/2
    // 1 balita -> 1
    // jika:
    // - yg makan ganjil & > 5 orang, maka 1 dewasa pr +1 porsi
    for(String people: order){
        String[] check = people.split(" ");
        if(people.contains("laki-laki dewasa")){
            result += Integer.parseInt(check[3]) * 2;
            sumPeople += Integer.parseInt(check[3]);
        }else if(people.contains("perempuan dewasa")){
            result += Integer.parseInt(check[3]);
            nambah += Integer.parseInt(check[3]);
            sumPeople += Integer.parseInt(check[3]);
        }else if(people.contains("remaja")){
            result += Integer.parseInt(check[2]);
            sumPeople += Integer.parseInt(check[2]);
        }else if(people.contains("anak-anak")){
            result += Integer.parseInt(check[2]) * 0.5;
            sumPeople += Integer.parseInt(check[2]);
        }else if(people.contains("balita")){
            result += Integer.parseInt(check[2]);
            sumPeople += Integer.parseInt(check[2]);
        }
    }
    if(sumPeople > 5 && sumPeople % 2 == 1){
        result += nambah;
    }
    return result;
    }
}
