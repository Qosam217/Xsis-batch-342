package day_6;

import java.util.Arrays;

public class Logic {
    public static void main(String[] args) {
        String kalimat = "      Here the word";
        System.out.println(kalimat);
        logic1(kalimat);
    }
    public static void logic1(String str){
        String word = str.toLowerCase().trim();
        char[] sortedWord = word.toCharArray();
        Arrays.sort(sortedWord);
        word = new String(sortedWord);

        String dpr = "aiueo";
        String konsonan = "Huruf konsonan : ";
        String vokal = "Huruf Vokal : ";
        
        for(int i = 0; i < word.length(); i++){
            if(dpr.contains(word.substring(i, i+1))){
                vokal += word.substring(i,i+1);
            }else if (word.substring(i, i+1).equals(" ")) {
                continue;
            }else{
                konsonan += word.substring(i,i+1);
            }
        }
        System.out.println(vokal);
        System.out.println(konsonan);
    }
}
