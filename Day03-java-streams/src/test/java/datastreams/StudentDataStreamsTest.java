package datastreams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.*;
class StudentDataStreamsTest {
    @Test
    void testSaveAndReadStudent() throws IOException {
        Student student = new Student(102, "Jane Doe", 3.85);
        String file = "C:/Users/asus/OneDrive/Desktop/Daily Learning notes/Student.txt";

        StudentDataStreams.saveStudentData(file, student);
        Student retrieved = StudentDataStreams.readStudentData(file);

        assertEquals(student.rollNumber, retrieved.rollNumber);
        assertEquals(student.name, retrieved.name);
        assertEquals(student.gpa, retrieved.gpa);

        new File(file).delete();
    }

    @Test
    void testInvalidFile() {
        assertThrows(IOException.class, () -> StudentDataStreams.readStudentData("invalid.dat"));
    }
}