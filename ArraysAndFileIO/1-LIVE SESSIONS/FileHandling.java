import java.io.File;
import java.io.FileOutputStream;

public class FileHandling {
    public static void main(String[] args) {
        try{
            String fame = "Sample.txt";
            File obj = new File(fame);
            if(obj.exists()){
                System.out.println("Flie already exists.");
                System.out.println("you can write in the file");
            }//else{
            //     obj.createNewFile();
            //     System.out.println("File created");
            // }
            String text = "\nNew data for the file for the sample.txt";
            byte[] byteText = text.getBytes();
            FileOutputStream obj2 = new FileOutputStream(obj, true);
            obj2.write(byteText);
            obj2.close();

        } catch(Exception e){
            System.out.println("An exception occur");

        }
    }
    
}
