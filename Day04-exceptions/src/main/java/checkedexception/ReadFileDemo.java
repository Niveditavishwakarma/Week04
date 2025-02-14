package checkedexception;
import java.io.*;
public class ReadFileDemo {
    public static void main(String[] args) {
        String fileName = "data.txt";
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file");
                }
            }
        }
    }
}
