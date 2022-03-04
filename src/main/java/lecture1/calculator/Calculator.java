package lecture1.calculator;

public class Calculator {

    public Calculator() {
    }

    public static String add(int numA, int numB) {
        return String.format("%d + %d = %d", numA, numB, numA + numB);
    }

    public static String subtract(int numA, int numB) {
        return String.format("%d - %d = %d", numA, numB, numA - numB);
    }

    public static String multiply(int numA, int numB) {
        return String.format("%d * %d = %d", numA, numB, numA * numB);
    }

    public static String divide(int numA, int numB) {
        if (numB == 0) {
            return "Cannot divide with 0.";
        }

        if (numA % numB == 0) {
            return String.format("%d / %d = %d", numA, numB, numA / numB);
        } else {
            return String.format("%d / %d = %.1f", numA, numB, (double) numA / (double) numB);
        }
    }
}
