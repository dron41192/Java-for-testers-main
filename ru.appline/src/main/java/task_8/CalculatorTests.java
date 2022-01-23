package task_8;

import org.junit.Assert;
import org.junit.Test;
import task_5.logic.Calculator;

public class CalculatorTests {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(6, 5);

        Assert.assertEquals(11, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(6, 2);

        Assert.assertEquals(4, result);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(7, 7);

        Assert.assertEquals(49, result);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();

        int result = calculator.divide(8, 2);

        Assert.assertEquals(4, result);
    }
}
