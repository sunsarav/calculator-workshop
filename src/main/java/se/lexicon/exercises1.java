package se.lexicon;

import java.util.Scanner;

public class exercises1 {
    public static void main(String[] args) {

        //To print my name with greeting
        String greeting = "Hello";
        System.out.println(greeting);
        String name = "Shamu";
        System.out.println(name);

        //Take input and say leap year or not
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }*/

        //Do arithmetic operations of two numbers
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = scanner1.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scanner1.nextInt();
        System.out.println("What do you want to do (+,-,*,/): ");
        char op = scanner1.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Number is not divisible by 0");
                    break;
                }
            default:
                System.out.println("Please enter a valid operator");
                break;
        }
                scanner1.close();






    }
}










