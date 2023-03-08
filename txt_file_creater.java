import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class txt_file_creater{
    public static void main(String[] args) throws IOException {
        String str = "this is my practice for wiriting a txt file from java";
        try {
             FileWriter file = new FileWriter("kazuaki.txt");
        BufferedWriter writer = new BufferedWriter(file);
        writer.write(str);
        writer.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
       
    }
}