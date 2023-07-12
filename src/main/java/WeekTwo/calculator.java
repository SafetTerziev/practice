package WeekTwo;

import java.util.Scanner;

public class calculator {
    public double addition(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double substraction(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
        }
        return sum;
    }

    public double multiplication(double[] array) {
        double multi = 1;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        return multi;
    }

    public double division(double[] array) {
        double div = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                continue;
            div /= array[i];
        }
        return div;
    }

    public static void main(String[] args) {
        System.out.println("Enter arithmetic expresion: ");
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        expression.split(" ");

    }
}
