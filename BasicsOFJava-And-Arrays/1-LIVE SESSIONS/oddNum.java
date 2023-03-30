import java.util.Scanner;  
public class oddNum  
{  
public static void main(String[] args)   
{  
int number, i;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the limit: ");  
number = sc.nextInt();    
i=1;   
System.out.print("Lit of odd numbers: ");  
//the while loop executes until the condition become false  
while(i<=number)  
{  
//prints the odd number  
System.out.print(i +" ");   
//increments the variable i by 2  
i=i+2;  
}     
}  
}  
