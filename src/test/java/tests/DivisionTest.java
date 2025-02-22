package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest{

    @DataProvider(name = "values for division")
    public Object[][] valuesForDivision() {
        return new Object[][] {
                {10, 2, 5},
                {2, 10, 0.2},
                {0.5, 0.2, 2.5},
                {0.0001, 5, 0.00002},
                {-10, -2, 5},
                {-10, 2, -5},
                {-4.4, -2.2, 2}
        };
    }

    @Test (description = "Try to divide two values",
            priority = 2,
            dataProvider = "values for division")
    public void divideValues(double value1, double value2, double result) {
        double actualRes = calculator.division(value1, value2);
        System.out.println("Result of division is " + actualRes);
        Assert.assertEquals(actualRes, result);
    }

    @Test (description = "Try to divide on zero",
            priority = 3,
            invocationCount = 4, threadPoolSize = 2)
    public void divideByZero() {
        try  {
            calculator.division(10, 0);
        } catch (ArithmeticException exception) {
            String actualRes = exception.getMessage();
            Assert.assertEquals(actualRes, "Division by zero is not allowed!");
            System.out.println(exception.getMessage());
        }
    }
}
