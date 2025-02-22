package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SummingTest extends BaseTest {

    @DataProvider(name = "values for summing")
    public Object[][] valuesForSumming() {
        return new Object[][] {
                {10, 2, 12},
                {0.5, 0.2, 0.7},
                {0.0001, 0.0001, 0.0002},
                {-15, -3, -18},
                {-20, 4, -16},
                {2.5, 0, 2.5},
                {0, 0, 0}
        };
    }

    @Test (description = "Try to summarize two values",
            priority = 0,
            dataProvider = "values for summing")
    public void sumValues(double value1, double value2, double expectedResult){
        double actualSum = calculator.sum(value1, value2);
        System.out.println("Result of sum is " + actualSum);
        Assert.assertEquals(actualSum, expectedResult);
    }
}
