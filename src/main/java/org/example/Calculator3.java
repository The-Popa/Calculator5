package org.example;


import java.util.Scanner;

public class Calculator3 {

    public static void main( String[] args ) {

        // Creates scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Starts and stops the calculator
        boolean run = true;

        // Controls the variables of input and output
        double number1;
        double number2;
        double answer;

        // While loop to keep the calculator running
        while (run) {

            // Calculator interface
            System.out.println("Calculator: ");
            System.out.println("Choose operation:");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Exit calculator");

            // choose a operation
            double operation = scanner.nextDouble();

            // Chooses action based on input
            switch  ((int) operation) {
                case 1:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();
                    answer = number1 + number2;
                    System.out.println("Answer: " + answer);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();
                    answer = number1 - number2;
                    System.out.println("Answer: " + answer);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();
                    answer = number1 * number2;
                    System.out.println("Answer: " + answer);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();
                    answer = number1 / number2;
                    System.out.println("Answer: " + answer);
                    break;

                case 5:
                    System.out.println("Good bye!");
                    scanner.close();
                    run = false;
                    break;





            }
        }
    }
}

