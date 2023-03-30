import java.io.BufferedReader;
import java.io.FileReader;

public class studentReport2 {
    public static void main(String[] args) {
        String d = ",";
        String student;
        try {
            FileReader file = new FileReader("Question4Solution.csv");
            BufferedReader buffer = new BufferedReader(file);
            while ((student = buffer.readLine()) != null) {

            // System.out.println(student);
            String[] newStudent = student.split(d);
            System.out.println("Roll no " + newStudent[0] + " Student Name " + newStudent[1]);
            }




        } catch (Exception e) {
           System.out.println("Error obtained in code" + e.getMessage()); // TODO: handle exception
        }

    }
}
