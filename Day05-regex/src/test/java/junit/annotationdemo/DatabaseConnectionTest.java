package junit.annotationdemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    private DatabaseConnection databaseConnection;

    @BeforeEach
    void setUp() {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @AfterEach
    void tearDown() {
        databaseConnection.disconnect();
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(databaseConnection.isConnected(), "Database connection should be established.");
    }

    @Test
    void testConnectionClosed() {
        databaseConnection.disconnect();
        assertFalse(databaseConnection.isConnected(), "Database connection should be closed.");
    }
}
