package weekTwo;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression: ");
        String input = scanner.nextLine();

        String expression = scanner.nextLine();
        expression = expression.replaceAll("\\s", "");

        double result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static double evaluateExpression(String expression) {
        String[] tokens = expression.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        double result = 0;
        char operator = '+';

        for (String token : tokens) {
            if (isOperator(token.charAt(0))) {
                operator = token.charAt(0);
            }
            else {
                double operand = Double.parseDouble(token);

                switch (operator) {
                    case '+':
                        result += operand;
                        break;
                    case '-':
                        result -= operand;
                        break;
                    case '*':
                        result *= operand;
                        break;
                    case '/':
                        result /= operand;
                        break;
                }
            }
        }
        return result;
    }



}