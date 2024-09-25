package day_7;

import java.util.HashMap;
import java.util.Scanner;

public class Transfer {
    
    public static void main(String[] args) {
        HashMap<Integer, Double> dataPin = new HashMap<Integer, Double>();
        dataPin.put(123456, (double) 100000);
        dataPin.put(789101, (double) 5000000);
        dataPin.put(112131, (double) 375000000);

        Scanner InputScanner = new Scanner(System.in);
        while (true) { 
            System.out.println("(ketik 0 untuk exit)");
            System.out.print("Masukkan PIN \t: ");
            int inputPin = InputScanner.nextInt();
            if(dataPin.keySet().contains(inputPin)){

                while (true) { 
                    System.out.print("Pilih aktivitas : (1. Setor Uang) (2. Transfer) (3.Kembali)\n");
                    int choice = InputScanner.nextInt();
                    if(choice == 1) {
                        deposit(dataPin, inputPin, InputScanner);
                    }else if (choice ==2) {
                        transfer(dataPin, inputPin, InputScanner);
                    }else if(choice == 3){
                        System.out.println("Terima kasih telah menggunakan Bank Jawa");
                        break;
                    }else{
                        System.out.println("Mohon pilih aktivitas");
                    }

                }
            }else if(inputPin == 0){
                InputScanner.close();
                break;
            }else{
                System.out.println("PIN salah");
            }
        }
    }

    public static void deposit(HashMap<Integer, Double> account, int pin, Scanner depositScanner){
        while (true) { 
            try {
                System.out.print("Uang yang disetor \t: ");
                double inpMoney = depositScanner.nextDouble();
                account.put(pin, account.get(pin) + inpMoney);
                System.out.println("Saldo \t:\t" + account.get(pin));
                break;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("\nMohon isi dengan angka saja");
                break;
            }
        }
    }

    public static void transfer(HashMap<Integer, Double> account, int pin, Scanner transferScanner){
        double valueTransfer;
        double valueWithAdmin;
        int targetAccount;
        int bankCode;

        while (true) { 
            System.out.print("Pilihan Transfer \t: (1. Antar Rekening) (2. Antar Bank) (3. Kembali)\n");
            int transferChoice = transferScanner.nextInt();
            if(transferChoice == 1){
                System.out.print("Masukkan rekening tujuan \t:");
                targetAccount = transferScanner.nextInt();
                while (true) { 
                    System.out.print("Masukkan nominal transfer \t:");
                    valueTransfer = transferScanner.nextDouble();
                    if (valueTransfer < account.get(pin)){
                        break;
                    }else{
                        System.out.println("Saldo anda kurang dari " + valueTransfer);
                    }
                }
                account.put(pin, account.get(pin) - valueTransfer);
                System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + account.get(pin));

            }else if(transferChoice == 2){
                System.out.print("Masukkan kode bank \t: ");
                bankCode = transferScanner.nextInt();

                System.out.print("Masukkan rekening tujuan \t: ");
                targetAccount = transferScanner.nextInt();

                while (true) { 
                    System.out.print("Masukkan nominal transfer \t: ");
                    valueTransfer = transferScanner.nextDouble();
                    valueWithAdmin = valueTransfer + 7500;
                    if (valueWithAdmin < account.get(pin)){
                        break;
                    }else{
                        System.out.println("Saldo anda kurang dari " + valueWithAdmin);
                    }
                }
                account.put(pin, account.get(pin) - valueWithAdmin);
                System.out.println("Transaksi berhasil, saldo anda saat ini Rp." + account.get(pin));

            }else if(transferChoice == 3){
                break;
            }else{
                System.out.println("Mohon pilih pilihan transfer");
            }
        }
    }
}
