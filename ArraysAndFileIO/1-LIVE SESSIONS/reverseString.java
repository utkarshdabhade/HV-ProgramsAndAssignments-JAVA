import java.util.Scanner;  
public class reverseString 
{  
public static void main(String args[])  
{  
String str;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a String: ");  
str=sc.nextLine();                    //reading string from user  
System.out.print("After reverse string is: ");  
for(int i=str.length();i>0;--i)                //i is the length of the string  
{  
System.out.print(str.charAt(i-1));            //printing the character at index i-1  
}  
}  
}
