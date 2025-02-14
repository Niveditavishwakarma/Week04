package datastreams;
import java.io.*;

import static datastreams.StudentDataStreams.saveStudentData;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 3.75);
        String file = "C:/Users/asus/OneDrive/Desktop/Daily Learning notes/Student.txt";

        try {
            saveStudentData(file, student);
            System.out.println("Student data saved.");

            Student retrieved = StudentDataStreams.readStudentData(file);
            System.out.println("Retrieved Student: Roll: " + retrieved.rollNumber + ", Name: " + retrieved.name + ", GPA: " + retrieved.gpa);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
