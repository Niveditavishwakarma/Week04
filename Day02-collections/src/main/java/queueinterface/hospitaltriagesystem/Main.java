package queueinterface.hospitaltriagesystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("John", 3),
                new Patient("Alice", 5),
                new Patient("Bob", 2)
        );

        System.out.println("Treatment Order: " + HospitalTriageSystem.triagePatients(patients));
    }
}
