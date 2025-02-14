package bytearray;
import java.io.*;
import java.util.*;

import static bytearray.ImageByteArrayConverter.byteArrayToImage;
import static bytearray.ImageByteArrayConverter.imageToByteArray;

public class Main {
    public static void main(String[] args) {
        String inputImage = "C:\\Users\\asus\\Downloads\\flower.jpg";
        String outputImage = "C:\\Users\\asus\\Downloads\\cat.jpg";

        try {
            byte[] imageBytes = imageToByteArray(inputImage);
            byteArrayToImage(imageBytes, outputImage);

            // Verify the files are identical
            if (Arrays.equals(imageBytes, imageToByteArray(outputImage))) {
                System.out.println("The image conversion was successful and the files are identical.");
            } else {
                System.out.println("The files are not identical.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
