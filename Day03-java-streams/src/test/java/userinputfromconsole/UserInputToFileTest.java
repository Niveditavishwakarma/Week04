package userinputfromconsole;
import java.io.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class UserInputToFileTest {

        @Test
        void testFileWriting() throws IOException {
            String testData = "Name: TestUser\nAge: 25\nFavorite Language: Java\n";
            String testFile = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\user_data.txt";

            try (FileWriter writer = new FileWriter(testFile)) {
                writer.write(testData);
            }

            File file = new File(testFile);
            assertTrue(file.exists());

            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(testFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            assertEquals(testData, content.toString(), "File content should match input data");
            file.delete();
        }

}