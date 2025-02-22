package mainApp;

public class Calculator {

    public Calculator() {
    }

    public double sum(double value1, double value2) {
        System.out.println("Summing of " + value1 + " and " + value2 + " is started!");
        return value1 + value2;
    }

    public double subtract(double value1, double value2) {
        System.out.println("Subtraction of " + value2 + " from " + value1 + " is started!");
        return value1 - value2;
    }

    public double multiply(double value1, double value2) {
        System.out.println("Multiplying of " + value1 + " and " + value2 + " is started!");
        return value1 * value2;
    }

    public double division(double value1, double value2) {
        System.out.println("Division of " + value1 + " on " + value2 + " is started!");
        if (value2 ==0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return value1 / value2;
    }
}






