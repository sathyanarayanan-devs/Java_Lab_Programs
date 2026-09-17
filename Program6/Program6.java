import java.util.Scanner;

// User-defined exception
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class Program6 {

    // Method using throws
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            // Using throw
            throw new AgeException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // try-catch-finally with user-defined exception
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);
        }
        catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Age verification completed.");
        }

        // try-catch for built-in exception
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int result = 100 / num;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        }
        finally {
            System.out.println("Arithmetic operation completed.");
        }

        sc.close();
    }
}