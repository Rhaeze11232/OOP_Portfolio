package StudentFileManager;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== STUDENT INFORMATION ===");
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Year Level: ");
        String yearLevel = scanner.nextLine();

        // Step 9: Added Email and Contact Number fields
        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();

        // Step 10: FileWriter set to append mode (true)
        try {
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("Student Name: " + name + "\n");
            writer.write("Student Number: " + studentNumber + "\n");
            writer.write("Course: " + course + "\n");
            writer.write("Year Level: " + yearLevel + "\n");
            writer.write("Email Address: " + email + "\n");
            writer.write("Contact Number: " + contactNumber + "\n");
            writer.write("----------------------------------------\n");
            writer.close();

            System.out.println("\nStudent information added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        // Read and display all entries
        try {
            FileReader fileReader = new FileReader("student.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;

            System.out.println("\n=== ALL SAVED STUDENT INFORMATION ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }

        scanner.close();
    }
}