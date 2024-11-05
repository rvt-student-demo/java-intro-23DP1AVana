package lv.rvt;

public class Example {
    public static void main(String[] args) {
        sum(8,2);
       
        int number1 = 777;
        int number2 = 7;
       
        sum(number1, number2);       
    }
   
    public static void sum(float first, float second) {
        System.out.println("" + first + " + " + second + " = " + (first/ second));
    }
}