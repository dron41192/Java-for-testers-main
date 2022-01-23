package task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of task (1 or 2):");
        int numberOfTask = scan.nextInt();

        if (numberOfTask == 1) {
            System.out.println("Enter first number:");
            float first = Float.parseFloat(scan.next());

            System.out.println("Enter second number:");
            float second = Float.parseFloat(scan.next());

            System.out.println("Enter operator:");
            char operator = scan.next().charAt(0);

            float result = calculate(first, second, operator);
            System.out.printf("Result: %.4f", result);

        } else if (numberOfTask == 2) {

            System.out.println("Enter length of array:");
            int length = scan.nextInt();
            String[] array = new String[length];

            System.out.println("Enter words:");

            for (int i = 0; i < array.length; i++) {
                array[i] = scan.next();
            }

            System.out.println(getStringWithMaxLength(array));
        } else {
            throw new IllegalArgumentException(String.format("Number of task \"%s\" is not supported.", numberOfTask));
        }

        scan.close();
    }

    /**
     * Calculates two numbers.
     * @param first is a first number.
     * @param second is a second number.
     * @param operator is a +, -, * or /.
     * @return is result of a sum, subtraction, multiplication or division.
     */
    public static float calculate(float first, float second, char operator) {
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

    /**
     * Finds the longest string.
     * @param array is array of strings.
     * @return a long string.
     */
    public static String getStringWithMaxLength(String[] array) {
        String s = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (s.length() < array[i].length()) {
                s = array[i];
            }
        }

        return s;
    }
}