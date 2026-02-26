package se.lexicon;

import java.util.Scanner;

public class consoleCalculator {
    static void main() {

        {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            String choice;

            do {
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number: ");
                double num2 = scanner.nextDouble();

                System.out.println("Enter the operator(+,-,*,/): ");
                char operator = scanner.next().charAt(0);

                double add = num1 + num2;
                double sub = num1 - num2;
                double mul = num1 * num2;
                double div = num1 / num2;

                switch (operator) {

                    case '+':
                        System.out.println(add);
                        break;
                    case '-':
                        System.out.println(sub);
                        break;
                    case '*':
                        System.out.println(mul);
                        break;
                    case '/':
                        System.out.println(div);
                        break;
                    default:
                        System.out.println("Please select proper operator(+,-,*,/): ");
                        break;
                }

                System.out.println("Do you want to perform another calculation (y/n): ");
                choice = scanner.next();

                if (choice.equalsIgnoreCase("n")) {
                    running = false;
                }
            } while (running);
            System.out.println("Program exited");
        }
    }
}







