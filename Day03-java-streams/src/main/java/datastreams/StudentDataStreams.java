package datastreams;
import java.io.*;
public class StudentDataStreams {
    public static void saveStudentData(String fileName, Student student) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(student.rollNumber);
            dos.writeUTF(student.name);
            dos.writeDouble(student.gpa);
        }
    }

    public static Student readStudentData(String fileName) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            return new Student(roll, name, gpa);
        }
    }
}
