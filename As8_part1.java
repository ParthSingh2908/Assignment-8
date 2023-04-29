//Name: Parth Singh
//PRN: 21070126062
//Branch: AIML A3


// Create a custom exception class
class MyExcep extends Exception {
    MyExcep(String message) {
        super(message);
    }
}

public class As8_part1 {
    public static void main(String[] args) {
        // Loop through each argument passed to the program
        for (String arg : args) {
            try {
                // Convert the argument to an integer
                int n = Integer.parseInt(arg);
                // Check if the integer is out of range (1 to 10)
                if (n < 1 || n > 10) {
                    // Throw a custom exception if the integer is out of range
                    throw new MyExcep("Value out of range (1 to 10) for " + n);
                }
                // If the integer is in range, calculate its factorial and print the result
                System.out.println("Factorial of " + n + " is " + factorial(n));
            } catch (NumberFormatException e) {
                // If the argument cannot be converted to an integer, catch the exception and print an error message
                System.out.println("Invalid input: " + e.getMessage());
            } catch (MyExcep e) {
                // If the integer is out of range, catch the custom exception and print the error message
                System.out.println(e.getMessage());
            }
        }
    }

    // Calculate the factorial of an integer
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
