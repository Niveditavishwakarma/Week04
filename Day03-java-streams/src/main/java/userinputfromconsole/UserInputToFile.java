package userinputfromconsole;
import java.io.*;
public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\user_data.txt")){

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("Data successfully saved to user_data.txt");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}


