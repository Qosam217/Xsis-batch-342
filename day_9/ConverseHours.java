package day_9;

import java.util.Scanner;

public class ConverseHours {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        String inputHours = InputScanner.next();
        String[] splitHour = inputHours.split(inputHours);
        InputScanner.close();
    }
}
