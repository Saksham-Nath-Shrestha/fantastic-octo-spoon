import java.util.Scanner;

public class w5q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continueProgram = true;

        while (continueProgram) {
            // Input numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Choose operation
            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = 0;
            boolean valid = true;

            // Perform operation
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero not allowed!");
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            // Ask if user wants to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                continueProgram = false;
            }

            System.out.println(); // blank line for readability
        }

        System.out.println("Program exited. Thank you!");
    }
}