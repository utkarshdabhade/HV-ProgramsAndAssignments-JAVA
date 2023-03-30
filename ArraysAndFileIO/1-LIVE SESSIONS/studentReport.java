import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class studentReport
{
public static void main(String[] args) throws FileNotFoundException{
         try {
         File file = new File ("Question4Solution.csv"); 
         
        //  by using scanner
        Scanner sc = new Scanner(file);
        sc.useDelimiter(","); 



        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    
        sc.close();
       
        } 
    
        
    catch (Exception e) {
        System.out.println(e);;

  
    }
}
}







 // int total = 0;
        // while (sc.hasNextLine()) {
          
        //      line = sc.nextLine();
        //     String[] array = line.split(",");
        //     int  RollNo = array[0];
        //     String StudentName = array[1];

        //     System.out.println(line);