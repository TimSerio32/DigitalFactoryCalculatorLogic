package serio.tim.android.com.calculatorlogic;

public class CalculatorLogic {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if(num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN;
        }

    }

    public static double getSine(double num) {
        return Math.sin(num);
    }

    public static double getCosine(double num) {
        return Math.cos(num);
    }

    public static double getTangent(double num) {
        return Math.tan(num);
    }
}
