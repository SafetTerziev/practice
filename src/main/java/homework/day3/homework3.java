package homework.day3;

import java.util.Scanner;

public class homework3

{
    public static int getMin(int f, int s, int th){
        int min = f;

        if (min > s)
            min = s;

        else if (min > th)
            min = th;

        return min;
    }
    public static void EvenOrOdd(int number){

        if (number % 2 == 0)
            System.out.println("true");
        else if (number % 2 != 0)
            System.out.println("false");


    }

    public static void main(String[] args) {
        //Homework day 3
        //zad 1
        System.out.println("Min is " + exercise1(3,4,2));

        //zad 2
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = num.nextInt();
        exercise2(n);
    }
}
