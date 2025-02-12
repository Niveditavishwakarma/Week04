package aidrivenresumescreeningsystem;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResumeScreeningTest {
    @Test
    void testSoftwareEngineerResume() {
        Resume<SoftwareEngineer> seResume = ResumeScreening.processCandidate(new SoftwareEngineer());
        assertEquals("Processing Resume for: Software Engineer: Develop and maintain software applications.", seResume.processResume());
    }

    @Test
    void testDataScientistResume() {
        Resume<DataScientist> dsResume = ResumeScreening.processCandidate(new DataScientist());
        assertEquals("Processing Resume for: Data Scientist: Analyze and interpret complex data.", dsResume.processResume());
    }

    @Test
    void testProductManagerResume() {
        Resume<ProductManager> pmResume = ResumeScreening.processCandidate(new ProductManager());
        assertEquals("Processing Resume for: Product Manager: Oversee product development and strategy.", pmResume.processResume());
    }

    @Test
    void testNullResumeValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ResumeScreening.processCandidate(null);
        });
        assertEquals("Invalid job role: Role cannot be null", exception.getMessage());
    }

    @Test
    void testMultipleResumesScreening() {
        List<JobRole> roles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        ResumeScreening.processMultipleResumes(roles);
    }
}

