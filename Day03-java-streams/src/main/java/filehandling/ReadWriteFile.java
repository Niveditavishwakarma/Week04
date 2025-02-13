package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {

        public static void main(String[] args) {
            try (FileInputStream fis = new FileInputStream("C:/Users/asus/OneDrive/Desktop/Daily Learning notes/git commands.txt");
                 FileOutputStream fos = new FileOutputStream("C:/Users/asus/OneDrive/Desktop/Daily Learning notes/output.txt")) {

                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

