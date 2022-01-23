package task_5;

import task_5.logic.Calculator;
import task_5.logic.Model;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final Scanner scan = new Scanner(System.in);
    private static final Model model = Model.getInstance();
    private static final Calculator calc = new Calculator();

    public static void main(String[] args) {
        try {
            calc.setA(scan.nextInt());
            calc.setOperator(scan.next());
            calc.setB(scan.nextInt());

            int a = calc.getA();
            int b = calc.getB();
            String operator = calc.getOperator();
            model.print(a, b, operator);
        } catch (InputMismatchException e) {
            System.out.println("Error: please enter through spaces.");
        }
    }
}
