

public class AdvancedCalculator extends Calculator {
    final static String Percentage = "%";
    final static String Factorial = "!";
    final static String Square = "SQ";
    final static String Power = "^";
    final static String Cube = "CB";

    public static void Percentage(int num1, int num2) {
        Display(num1, num2, Percentage, ((num1/num2)*100));
    }


    public static void Square(int num1) {
        Display(num1, num1, Square, num1*num1);       
    }


    public static void Cube(int num1) {
        Display(num1, num1, Cube, num1*num1*num1);       
    }

    public static void Power(int num1, int num2) {
        Display(num1, num2, Power, (Math.pow(num1,num2)));
    }

    

}
