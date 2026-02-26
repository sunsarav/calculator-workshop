package se.lexicon;

import java.util.Scanner;

public class consoleCalculator {
    static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            do {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                boolean validOp = false;
                while (!validOp) {
                    System.out.print("Enter the operator(+,-,*,/): ");
                    char operator = scanner.next().charAt(0);

                    switch (operator) {

                        case '+':
                            System.out.println("Result: " + (num1 + num2));
                            validOp = true;
                            break;
                        case '-':
                            System.out.println("Result: " + (num1 - num2));
                            validOp = true;
                            break;
                        case '*':
                            System.out.println("Result: " + (num1 * num2));
                            validOp = true;
                            break;
                        case '/':
                            if (num2 != 0) {
                                System.out.println("Result: " + (num1 / num2));
                                validOp = true;
                            } else {
                                System.out.println("Error: Cannot divide by zero!");
                                validOp = true;
                            }
                            break;
                        default:
                            System.out.println("Invalid input! Please select proper operator");

                    }
                }
                System.out.println("Do you want to perform another calculation (y/n): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("n")) {
                    running = false;
                }
            } while (running);
            System.out.println("Program exited");

        }
    }
}








