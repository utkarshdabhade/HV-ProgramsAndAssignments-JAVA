import java.util.*;
public class cumulativeArray{

   //main method
   public static void main(String[] args) {
    //   int sum = 0;
      
    //   //Declaring the array
    //   int numbers[] = {5, 3, 4, 2, 0, 8};
      

      Scanner console = new Scanner(System.in);		
      System.out.print("How many numbers? ");
          int number = console.nextInt();
          int k = 1;
          for(int i = 1; i <= number; i++) {
              System.out.print("Next number --> ");
              int num = console.nextInt();
              k *= num;
          }
          System.out.println("Product = " + k);

        }
    }