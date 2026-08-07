import MyPackage.Calculator;
import java.util.Scanner;
class MyCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    @Override
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulus by zero is not allowed.");
            return 0; // Return 0 or handle the error as needed
        } else {
            return a % b;
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        MyCalculator calculator = new MyCalculator();
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        if(num2 != 0) {
            System.out.println("Division: " + calculator.divide(num1, num2));
        } else {
            System.out.println("Division: Error: Division by zero is not allowed.");
        }

        if(num2 != 0) {
            System.out.println("Modulus: " + calculator.modulus(num1, num2));
        } else {
            System.out.println("Modulus: Error: Modulus by zero is not allowed.");
        }

        sc.close();
    }
}
