package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.additive.RetryAnalyzer;

public class SubtractTest extends BaseTest{

    @DataProvider(name = "values for subtraction")
    public Object[][] valuesForSubtraction() {
        return new Object[][] {
                {10, 2, 8},
                {0.5, 0.2, 0.3},
                {0.0001, 0.0001, 0},
                {-15, -3, -12},
                {-20, 4, -24},
                {4.1, -2.1, 6.2}
        };
    }

    @Test (description = "Try to subtract two values",
            priority = 1,
            dataProvider = "values for subtraction",
            retryAnalyzer = RetryAnalyzer.class)
    public void subtractValues(double value1, double value2, double expectedResult) {
        double actualRes = calculator.subtract(value1, value2);
        System.out.println("Result of subtraction is " + actualRes);
        Assert.assertEquals(actualRes, expectedResult);
    }
}
