package checkedexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
class ReadFileDemoTest {
    @Test
    public void testFileExists() {
        try {
            FileReader file = new FileReader("C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\output.txt");
            BufferedReader reader = new BufferedReader(file);

            assertNotNull(reader.readLine());
            reader.close();
        } catch (IOException e) {
            fail("IOException should not occur if file exists");
        }
    }

    @Test
    public void testFileNotFound() {
        Exception exception = assertThrows(IOException.class, () -> {
            FileReader file = new FileReader("nonexistent.txt");
        });

        assertEquals(FileNotFoundException.class, exception.getClass());
    }

}