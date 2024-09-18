public class GenByYear {
    public static void main(String[] args) {
        System.out.println(genByYear(2012));
    }

    public static String genByYear(int year){
        String gen = new String();
        if(year < 1946){
            gen = "The Builders";
        }else if(year < 1964){
            gen = "Baby Boomer";
        }else if(year < 1979){
            gen = "Gen X";
        }else if(year < 1994){
            gen = "Gen Y";
        }else if(year < 2009){
            gen = "Gen Z";
        }else if(year < 2024){
            gen = "Gen Alpha";
        }else if (year < 2039){
            gen = "Gen Beta";
        }
        return gen;
        
        
    }
}
