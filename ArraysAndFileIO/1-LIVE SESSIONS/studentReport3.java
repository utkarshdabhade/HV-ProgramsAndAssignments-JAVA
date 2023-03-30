import java.io.BufferedReader;
import java.io.FileReader;

public class studentReport3 {
  public static void main(String[] args) {
    String student;
    int cCount = 0;
    try {
        FileReader file = new FileReader("Question4Solution.csv");
        BufferedReader buffer = new BufferedReader(file);
        while ((student = buffer.readLine()) != null) {
            cCount += student.length();
        }
    System.out.println(cCount);
    buffer.close();



    } catch (Exception e) {
       System.out.println("Error obtained in code" + e.getMessage()); // TODO: handle exception
    }

}
}

  
