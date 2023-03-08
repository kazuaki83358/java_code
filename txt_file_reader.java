import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class txt_file_reader{
    public static void main(String[] args) throws IOException {
       try{BufferedReader reader = new BufferedReader(new FileReader("kazuaki.txt"));
       String line = reader.readLine();
       while (line!=null) {
           System.out.println(line);
           line=reader.readLine();
       }}catch(FileNotFoundException e){
           System.out.println("sorry file not found............ ");
       }catch(IOException e){
        System.out.println("sorry some error occured..........");
       }

    }
}
