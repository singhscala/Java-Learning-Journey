package cdac.coreJava.day10.Assignment.ExceptionHandling;

public class Input {

    public static String calculateRatio(String num1Str, String num2Str) {
        try {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            int result = num1 / num2;
            return result+" ";

        } catch (NumberFormatException | ArithmeticException e) {
            if (e instanceof NumberFormatException) {
                System.out.println("Error: Input is not a valid number.");
            } else if (e instanceof ArithmeticException) {
                System.out.println("Error: Division by zero is not allowed.");
            }
            return "Error: Invalid operation.";
        } finally {
            System.out.println("Cleanup complete: Ratio calculation finished.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + calculateRatio("10", "2"));
        System.out.println("Result: " + calculateRatio("ten", "2"));
        System.out.println("Result: " + calculateRatio("10", "0"));
    }
}