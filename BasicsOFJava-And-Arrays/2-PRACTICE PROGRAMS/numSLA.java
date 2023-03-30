import java.util.Scanner;

public class numSLA {
public static void main(String [] args) {

Scanner sc = new Scanner (System.in);
   
int num1;
int num2;
int num3;
int avg;
int largest;
int smallest;
int temp1;
int temp2;

System.out.println("Enter the value of number 1:");
num1 = sc.nextInt();
System.out.println("Enter the value of number 2:");
num2 = sc.nextInt();
System.out.println("Enter the value of number 3:");
num3 = sc.nextInt();

avg = (int) ((num1 + num2 + num3)/3);
System.out.println(" The average is " + avg );

temp1=num1>num2?num1:num2;
largest = num3 > temp1?num3:temp1;

System.out.println(" The largest number is " + largest);

temp2=num1<num2?num1:num2;
smallest = num3 < temp2?num3:temp2;

System.out.println(" The smallest number is " + smallest);

        


    }
}
