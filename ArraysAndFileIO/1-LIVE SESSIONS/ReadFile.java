import java.io.File;
import java.io.FileInputStream;

public class ReadFile {
    public static void main(String[] args){
        try{
            String fame = "Sample.txt";
            File obj4 = new File(fame);
            FileInputStream obj5 = new FileInputStream(obj4);
            int i ;
            String data = " ";
            while(
                ( i = obj5.read()) != -1
                )
                {
                    data += ((char)i);
                    System.out.println((char)i);


                }
                obj5.close();
                System.out.println(data);


        }catch(Exception e){
            System.out.println("An exception occur");

        }
    
    }
    
}
