package bytearray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
class ImageByteArrayConverterTest {
    @Test
    void testImageConversion() throws IOException {
        String inputImage = "C:\\Users\\asus\\Downloads\\flower.jpg";
        String outputImage = "C:\\Users\\asus\\Downloads\\cat.jpg";

        byte[] imageBytes = ImageByteArrayConverter.imageToByteArray(inputImage);
        ImageByteArrayConverter.byteArrayToImage(imageBytes, outputImage);

        byte[] outputBytes = ImageByteArrayConverter.imageToByteArray(outputImage);
        assertArrayEquals(imageBytes, outputBytes, "The byte arrays should be identical.");
    }

    @Test
    void testInvalidFile() {
        assertThrows(IOException.class, () -> ImageByteArrayConverter.imageToByteArray("invalid.jpg"));
    }

}