package Program1;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        
        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variable Declaration
        int num1, num2;
        double average;
        char grade;
        boolean isGreater;

        //Inputs
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        //Operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        double quotient;

        if (num2 != 0) {
            quotient = (double) num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            quotient = 0; // Assigning a default value
        }

        average = (num1 + num2) / 2.0;

        //Relational Operation
        isGreater = num1 > num2;

        //Grade Calculation - IF ELSE
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        //Outputs
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }
        System.out.println("Average: " + average);
        System.out.println("Is first number greater than second? " + isGreater);
        System.out.println("Grade: " + grade);

        //Loop - For Loop
        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " "); 
        }
        System.out.println(); // Print a new line after the numbers

        //Closing Scanner
        sc.close();
    }
}