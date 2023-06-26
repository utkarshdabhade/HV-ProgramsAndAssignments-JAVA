import java.util.Scanner;

public class CalculatorMain extends AdvancedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String op;

        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("Enter an operator..  +  -  *  /  !  %  SQ  CB  ^ :");
        op = sc.next();

        if (op.equals(Add)) Add (num1,num2);
        if (op.equals(Subtract)) Subtract(num1, num2);
        if (op.equals(Multiply)) Multiply(num1, num2);
        if (op.equals(Divide)) Divide(num1, num2);
        if (op.equals(Percentage)) Percentage(num1, num2);
        if (op.equals(Square)) Square(num1);
        if (op.equals(Cube)) Cube(num1);
        if (op.equals (Power)) Power(num1, num2);



        sc.close();
    
    }
    
}
