package junit.fileprocessor;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import static org.junit.jupiter.api.Assertions.*;


public class FileProcessorTest {

        private static final String TEST_FILENAME = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\test.txt";
        private static final String CONTENT = "Hello, World!";

        private FileProcessor fileProcessor;

        @BeforeEach
        public void setUp() {
            fileProcessor = new FileProcessor();
        }

        @AfterEach
        public void cleanUp() throws IOException {
            Files.deleteIfExists(Paths.get(TEST_FILENAME));
        }

        @Test
        void testWriteAndReadContent() throws IOException {
            fileProcessor.writeToFile(TEST_FILENAME, CONTENT);

            String readContent = fileProcessor.readFromFile(TEST_FILENAME);
            assertEquals(CONTENT, readContent, "Content read from file should match the written content");
        }

        @Test
        void testFileExistsAfterWriting() throws IOException {
            fileProcessor.writeToFile(TEST_FILENAME, CONTENT);
            assertTrue(Files.exists(Paths.get(TEST_FILENAME)), "File should exist after writing content");
        }

        @Test
        void testIOExceptionForNonExistentFile() {
            assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistentfile.txt"),
                    "Reading from a non-existent file should throw IOException");
        }
    }


