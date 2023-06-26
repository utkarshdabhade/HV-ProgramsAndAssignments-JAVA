public class Calculator {
final static String Add = "+";
final static String Subtract = "-";
final static String Multiply = "*";
final static String Divide = "/";

public static void Display(int num1, int num2, String operator, double d) {
   System.out.println(num1 + " " + operator + " " + num2 + " = " + d); 
}

public static void Add(int num1, int num2) {
    Display(num1, num2, Add, num1 + num2);
}

public static void Subtract(int num1, int num2) {
    Display(num1, num2, Subtract, num1 - num2);
}

public static void Multiply(int num1, int num2) {
    Display(num1, num2, Multiply, num1 * num2);
}

public static void Divide(int num1, int num2) {
    Display(num1, num2, Divide, num1 / num2);
}


}
