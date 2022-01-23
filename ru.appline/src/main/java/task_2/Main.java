package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        float first = Float.parseFloat(scan.next());

        System.out.println("Enter second number:");
        float second = Float.parseFloat(scan.next());

        System.out.println("Enter operator:");
        char operator = scan.next().charAt(0);

        float result = calculate(first, second, operator);
        System.out.printf("Result: %.4f", result);

        scan.close();
    }

    /**
     * Calculates two numbers.
     * @param first is a first number.
     * @param second is a second number.
     * @param operator is a +, -, * or /.
     * @return is result of a sum, subtraction, multiplication or division.
     */
    public static float calculate(float first, float second, char operator){
        switch (operator){
            case ('+'):
                return first + second;
            case ('-'):
                return first - second;
            case ('*'):
                return first * second;
            case ('/'):
                return first / second;
            default:
                throw new IllegalArgumentException(String.format("Operator \"%s\" is not supported.", operator));
        }
    }
}