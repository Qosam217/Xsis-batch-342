package day_6;

import java.util.HashMap;
import java.util.Scanner;

public class Converse {
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        Scanner InputScanner = new Scanner(System.in);
        System.out.println("Masukkan yang akan dikonversi :");
        System.out.print("Botol = ");
        data.put("Botol", InputScanner.nextInt());
        System.out.print("Gelas = ");
        data.put("Gelas", InputScanner.nextInt());
        System.out.print("Teko = ");
        data.put("Teko", InputScanner.nextInt());
        System.out.print("Cangkir = ");
        data.put("Cangkir", InputScanner.nextInt());
        InputScanner.nextLine();
        System.out.println("Konversi ke :");
        String req = InputScanner.nextLine();
        InputScanner.close();
        System.out.println("\nHasil konversi ke " + req +" = "+ doConverse(data, req));

    }
    public static float doConverse(HashMap<String, Integer> data, String required){
        float result = 0;
        if(required.toLowerCase().equals("botol")){
            for(String n: data.keySet()){
                if(n.equals("Botol")){
                    result += data.get(n);
                }else if(n.equals("Gelas")){
                    result += data.get(n) * 0.5;
                }else if(n.equals("Teko")){
                    result += data.get(n) * 5;
                }else if(n.equals("Cangkir")){
                    result += data.get(n) * 0.2;
                }
            }
        }else if(required.toLowerCase().equals("gelas")){
            for(String n: data.keySet()){
                if(n.equals("Botol")){
                    result += data.get(n) * 2;
                }else if(n.equals("Gelas")){
                    result += data.get(n);
                }else if(n.equals("Teko")){
                    result += data.get(n) * 25;
                }else if(n.equals("Cangkir")){
                    result += data.get(n) * 2.5;
                }
            }

        }else if(required.toLowerCase().equals("teko")){
            for(String n: data.keySet()){
                if(n.equals("Botol")){
                    result += data.get(n) * 0.2;
                }else if(n.equals("Gelas")){
                    result += data.get(n) * 0.1;
                }else if(n.equals("Teko")){
                    result += data.get(n) ;
                }else if(n.equals("Cangkir")){
                    result += data.get(n) * 0.04;
                }
            }
            
        }else if(required.toLowerCase().equals("cangkir")){
            for(String n: data.keySet()){
                if(n.equals("Botol")){
                    result += data.get(n) * 5;
                }else if(n.equals("Gelas")){
                    result += data.get(n) * 2.5;
                }else if(n.equals("Teko")){
                    result += data.get(n) * 25;
                }else if(n.equals("Cangkir")){
                    result += data.get(n) ;
                }
            }

        }
    // 1 botol = 2 gelas = 5 cangkir = 1/5 teko
    // 1 teko = 25 cangkir = 10 gelas = 5 botol
    // 1 gelas  = 2.5 cangkir = 1/2 botol = 1/10 teko
    // 1 cangkir = 1/5 botol = 2/5 gelas = 1/25 teko
    return result;
    }
}
