import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner
        scanner.close();
    }
}
