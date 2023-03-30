import java.io.BufferedReader;
import java.io.FileReader;

public class studentReport4 {
    public static void main(String[] args) {
        String student;
        int cCount = 0;
        int wCount = 0;
        int wSpaceCount = 0;
        try {
            FileReader file = new FileReader("hero.txt");
            BufferedReader buffer = new BufferedReader(file);
            while ((student = buffer.readLine()) != null) {
                cCount += student.length();
                String[] newWords = student.split("\\s+");
                wCount += newWords.length;
                wSpaceCount += newWords.length - 1; 
            }
        System.out.println(cCount);
        System.out.println(wCount);
        System.out.println(wSpaceCount);
        buffer.close();
    
    
    
        } catch (Exception e) {
           System.out.println("Error obtained in code" + e.getMessage()); // TODO: handle exception
        }
    
    }
    }
            
    

