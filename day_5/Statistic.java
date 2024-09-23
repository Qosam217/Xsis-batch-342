package day_5;

import java.util.Arrays;
import java.util.Scanner;

public class Statistic {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka = ");
        int size = InputScanner.nextInt();
        int[] data = new int[size];

        int point = 1;
        while(point <= size){
            System.out.print("Data ke - " + point + " = ");
            data[point-1] = InputScanner.nextInt();
            point += 1;
        }
        InputScanner.close();
        System.out.println();
        int [] sortedData = getSorted(data);

        System.out.println("Median = " + getMedian(sortedData));
        System.out.println("Mean = " + getMean(sortedData));
        System.out.println("Modus = " + getModus(sortedData));
        System.out.println("Min = " + getMin(sortedData));
        System.out.println("Max = " + getMax(sortedData));
    }

    public static int[] getSorted(int[] data){
        int[] result = new int[data.length];
        result = data;
        Arrays.sort(result);

        // int temp = 0;
        // for (int i = 0; i < data.length; i++) {
        //     for (int j = 0; j < data.length; j++) {
        //         if(data[i] < data[j]){
                    
        //         }
        //     }
            
        // }
        return result;
    }

    public static int getMedian(int[] data){
        int result;
        if(data.length % 2 == 0){
            result = (data[data.length/2] + data[(data.length/2)-1])/2;
        }else{
            result = data[data.length/2];
        }
        return result;
    }

    public static float getMean(int[] data){
        float result = 0;
        for(int i: data){
            result += i;
        }
        result = result/data.length;
        return result;
    }

    public static int getModus(int[] data){
        int modus = data[0];
        int num = 1;
        int temp = 1;
        for (int i = 1; i < data.length; i++) {
            if(data[i] == data[i-1]){
                temp += 1;
            }else{
                if(num < temp){
                    modus = data[i-1];
                    num = temp;
                temp = 0;
                }
            }
        }
        return modus;
    }

    public static int getMax(int[] data){
        int result = data[0];
        for(int i: data){
            if(result < i){
                result = i;
            }
        }
        return result;
    }

    public static int getMin(int[] data){
        int result = data[0];
        for(int i: data){
            if(result > i){
                result = i;
            }
        }
        return result;
    }


}
