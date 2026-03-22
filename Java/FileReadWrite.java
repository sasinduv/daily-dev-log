import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
// import java.io.Writer;
// import javax.sound.sampled.SourceDataLine;

public class FileReadWrite {
    public static void main(String[] args){
        String fileName =  "Sample.txt";

        //write to file

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write ("Hello, this my day 2 GitHub commit!\n ");
            writer.write ("Leraning java file handling.\n");
            writer.close();

            System.out.println("File written successfully.");
        }catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }


        //read from file
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading from file:");
             
             while ((line = br.readLine()) != null) {
                System.out.println(line);
                
             }

             br.close();
        } catch (Exception e) {
            System.out.println("Error reading from file:" + e.getMessage());
        }
    }
}