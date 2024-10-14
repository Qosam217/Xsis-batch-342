package day_8;

public class Calculator {
    private float num1;
    private float num2;
    private float result;

    public void Calculator(){
    }


    public void setNumber(float n1, float n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public void plus(){
        result = num1 + num2;
        System.out.print(num1 + " + " + num2 + " = " + result + "\n");
    }

    public void minus(){
        result =  num1 - num2;
        System.out.print(num1 + " - " + num2 + " = " + result + "\n");
    }

    public void times(){
        result =  num1 * num2;
        System.out.print(num1 + " * " + num2 + " = " + result + "\n");
    }

    public void divide(){
        if(num2 == 0){
            System.out.println("Error divided by zero");
        }else{
            result =   num1/num2;
            System.out.print(num1 + " : " + num2 + " = " + result + "\n");
        }
    }
}
