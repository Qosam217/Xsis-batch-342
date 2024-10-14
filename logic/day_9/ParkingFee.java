package day_9;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkingFee {
    /*
     * - >8 jam, 1rb / jam
     * - 8>jam>24, 8rb
     * - >24 jam, 15rb/24 jam, setelahnya ikuti aturan sebelumnya
     */
    public static void main(String[] args) {
        // Waktu masuk dan keluar parkir
        LocalDateTime parkIn = LocalDateTime.of(2024, 9, 23, 12, 45, 30);
        LocalDateTime parkOut = LocalDateTime.of(2024, 9, 27, 1, 23, 43);
        // Selisih jam
        long parkTime = ChronoUnit.HOURS.between(parkIn, parkOut);
        System.out.println("Parking Time = " + parkTime + " jam");
        // kalkulasi biaya parkir
        long fee = 1000;
        while (parkTime > 0) { 
            if (parkTime > 24) {
                fee += 15000;
                parkTime -= 24;
            }else if (parkTime > 7 && parkTime < 24) {
                fee += 8000;
                parkTime -= parkTime % 24;
            }else{
                fee += parkTime * 1000;
            }
        }
        System.out.println("Parking Fee  = Rp." + fee);
    }
}
