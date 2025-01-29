import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the original string
        System.out.println("Enter the original string: ");
        String a = scanner.nextLine();

        // Prompt the user to enter the starting and ending indices
        System.out.println("Enter the starting index: ");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the ending index: ");
        int endIndex = scanner.nextInt();

        // Validate indices
        if (startIndex >= 0 && endIndex <= a.length() && startIndex < endIndex) {
            // Extract the substring
            String substring = a.substring(startIndex, endIndex);

            // Display the result
            System.out.println("Extracted substring: " + substring);
        } else {
            System.out.println("Invalid indices. Please ensure 0 <= startIndex < endIndex <= string length.");
        }

        // Close the scanner
     scanner.close();
    }
}
