package bytearray;
import java.io.FileInputStream;
import java.io.*;
import java.util.Arrays;

public class ImageByteArrayConverter {
    public static byte[] imageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }
    public static void byteArrayToImage(byte[] byteArray, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
