package serialization;
import java.io.*;
import java.util.List;
public class EmployeeSerialization {
    public static void saveEmployees(List<Employee> employees, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(employees);
        }
    }

    public static List<Employee> loadEmployees(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Employee>) ois.readObject();
        }
    }
}
