package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest extends BaseTest{

    @DataProvider(name = "values for multiplying")
    public Object[][] valuesForMultiplying() {
        return new Object[][] {
                {10, 2, 20},
                {0.5, 0.2, 0.1},
                {0.0001, 5, 0.0005},
                {-10, -2, 20},
                {-15, 4, -60},
                {-4.1, -2.1, 8.61}
        };
    }

    @Test (description = "Try to multiply two values",
            priority = 4,
            dataProvider = "values for multiplying")
    public void multiplyValues(double value1, double value2, double expectedResult) {
        double actualRes = calculator.multiply(value1, value2);
        System.out.println("Result of multiplying is " + actualRes);
        Assert.assertEquals(actualRes, expectedResult);
    }
}
