import java.util.Scanner;

import java.util.Scanner;

// Custom exception class that is thrown when input string does not match "India"
class NOMATCHEXCP extends Exception {

    // Constructor that takes the line number and input string and constructs the error message
    NOMATCHEXCP(int line, String input) {
        super("Error on line " + line + ": Input string \"" + input + "\" does not match \"India\"");
    }
}

public class As8_part2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // If the input does not match "India", throw the custom exception with the line number
            if (!input.equals("India")) {
                throw new NOMATCHEXCP(new Throwable().getStackTrace()[0].getLineNumber(), input);
                // Using new Throwable().getStackTrace()[0].getLineNumber() to get the current line number
                // where the user input is taken, assuming that this is the line where the exception should be thrown
            }

            // If input matches "India", print success message
            System.out.println("Input string matches \"India\"");

        } catch (NOMATCHEXCP e) {
            // Catch the custom exception and print the error message
            System.out.println(e.getMessage());
        }
    }
}
