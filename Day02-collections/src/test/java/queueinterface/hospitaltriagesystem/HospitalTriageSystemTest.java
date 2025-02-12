package queueinterface.hospitaltriagesystem;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class HospitalTriageSystemTest {

    @Test
    void testTriagePatients() {
        List<Patient> patients = Arrays.asList(
                new Patient("John", 3),
                new Patient("Alice", 5),
                new Patient("Bob", 2)
        );

        List<String> expected = Arrays.asList("Alice", "John", "Bob");
        assertEquals(expected, HospitalTriageSystem.triagePatients(patients));
    }
}