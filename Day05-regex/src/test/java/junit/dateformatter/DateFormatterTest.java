package junit.dateformatter;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

    public class DateFormatterTest {

        private DateFormatter dateFormatter;
        @BeforeEach
        public void setUp() {
            dateFormatter = new DateFormatter();
        }

        @Test
        void testValidDate() {
            String inputDate = "2025-02-17";
            String expectedOutput = "17-02-2025";
            assertEquals(expectedOutput, dateFormatter.formatDate(inputDate), "Valid date should be formatted correctly.");
        }

        @Test
        void testValidDate2() {
            String inputDate = "1999-12-31";
            String expectedOutput = "31-12-1999";
            assertEquals(expectedOutput, dateFormatter.formatDate(inputDate), "Valid date should be formatted correctly.");
        }

        @Test
        void testEmptyDate() {
            String inputDate = "";
            assertNull(dateFormatter.formatDate(inputDate), "Empty date string should return null.");
        }

        @Test
        void testNullDate() {
            String inputDate = null;
            assertNull(dateFormatter.formatDate(inputDate), "Null date string should return null.");
        }
    }


