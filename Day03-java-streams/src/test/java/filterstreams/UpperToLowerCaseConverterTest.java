package filterstreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
class UpperToLowerCaseConverterTest {
    @Test
    void testConversion() throws IOException {
        String input = "test_input.txt";
        String output = "test_output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(input))) {
            writer.write("HELLO WORLD\nJAVA UNIT TEST\n");
        }

        UpperToLowerCaseConverter.convertToLowercase(input, output);

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(output))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append("\n");
            }
        }

        assertEquals("hello world\njava unit test\n", result.toString());

        new File(input).delete();
        new File(output).delete();
    }

    @Test
    void testInvalidFile() {
        assertThrows(IOException.class, () -> UpperToLowerCaseConverter.convertToLowercase("invalid.txt", "output.txt"));
    }

}