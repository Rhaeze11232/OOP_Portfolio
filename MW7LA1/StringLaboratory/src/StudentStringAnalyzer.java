import java.util.Scanner;

public class StudentStringAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 3 - Ask for Student Information
        System.out.print("Full Name: ");
        String fullName = sc.nextLine();
        
        System.out.print("Course: ");
        String course = sc.nextLine();
        
        System.out.print("Email Address: ");
        String email = sc.nextLine();
        
        System.out.print("Favorite Programming Language: ");
        String language = sc.nextLine();
        
        // Display Student Information
        System.out.println("\n========== STUDENT INFORMATION ANALYZER ==========\n");
        System.out.println("Full Name: " + fullName);
        System.out.println("Course: " + course);
        System.out.println("Email Address: " + email);
        System.out.println("Favorite Programming Language: " + language);
        
        System.out.println("\n========== STUDENT INFORMATION ==========");
        System.out.println("Full Name: " + fullName);
        System.out.println("Course: " + course);
        System.out.println("Email Address: " + email);
        System.out.println("Favorite Programming Language: " + language);
        
        // Step 4 - Display the Number of Characters
        System.out.println("\n========== STRING ANALYSIS ==========");
        System.out.println("Name Length: " + fullName.length());
        
        // Step 5 - Convert to Uppercase and Lowercase
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Lowercase: " + fullName.toLowerCase());
        
        // Step 6 - Display the First Character
        System.out.println("First Character: " + fullName.charAt(0));
        
        // Step 7 - Check the Email Address
        System.out.println("\nEmail contains @: " + email.contains("@"));
        System.out.println("Email ends with .com: " + email.endsWith(".com"));
        System.out.println("Email ends with .edu: " + email.endsWith(".edu"));
        System.out.println("Email ends with .edu.ph: " + email.endsWith(".edu.ph"));
        
        // Step 8 - Find the Username From the Email
        int atIndex = email.indexOf("@");
        if (atIndex != -1) {
            String username = email.substring(0, atIndex);
            System.out.println("Email Username: " + username);
        } else {
            System.out.println("Email Username: Cannot extract username");
        }
        
        // Step 9 - Compare the Programming Language
        System.out.println("\nFavorite Language: " + language);
        if (language.equalsIgnoreCase("Java")) {
            System.out.println("Java User: Yes");
        } else {
            System.out.println("Java User: No");
        }
        
        // Step 10 - Replace Spaces in the Student Name
        String modifiedName = fullName.replace(" ", "_");
        System.out.println("\nOriginal Name: " + fullName);
        System.out.println("Name with Underscores: " + modifiedName);
        
        // Step 11 - Split the Student Name
        String[] nameParts = fullName.split(" ");
        System.out.println("\nName Parts:");
        for (String part : nameParts) {
            System.out.println(part);
        }
        
        // Challenge Activity - Character Analyzer
        System.out.println("\n========== CHARACTER ANALYZER ==========");
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        
        for (char c : fullName.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            }
        }
        
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        
        System.out.println("\n========== END OF PROGRAM ==========");
        
        sc.close();
    }
}