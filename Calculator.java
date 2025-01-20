import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);

    // Addition
    public static void addition() {
        System.out.print("Enter two numbers to add: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
    }

    // Subtraction
    public static void subtraction() {
        System.out.print("Enter two numbers to subtract: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Difference: " + (num1 - num2));
    }

    // Multiplication
    public static void multiplication() {
        System.out.print("Enter two numbers to multiply: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Product: " + (num1 * num2));
    }

    // Division
    public static void division() {
        System.out.print("Enter two numbers to divide: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num2 != 0)
            System.out.println("Quotient: " + (num1 / num2));
        else
            System.out.println("Division by zero is not allowed!");
    }