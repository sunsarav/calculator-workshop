package se.lexicon;

import java.util.Scanner;

public class consoleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean calculation = true;

        //while(calculation) {}
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

            case '-':
                System.out.println(sub);

            case '*':
                System.out.println(mul);

            case '/':
                System.out.println(div);

            default:
                System.out.println("Please select proper operator");



        }







    }
}