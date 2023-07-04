package practice.day2;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = input.nextLine();

        System.out.println("Enter password: ");

        String password = input.nextLine();

        System.out.println("Sign to your profile!");

        String username2;
        String password2;
        do{
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter username: ");
            username2 = input2.nextLine();
            System.out.println("Enter password: ");
            password2 = input2.nextLine();

        }while(!username.equals(username2) && !password.equals(password2));
        System.out.println("Welcome, " + username);

        //zad 3
        Scanner text = new Scanner(System.in);
        System.out.println("Enter text: ");

        String text1 = text.nextLine();
        char[] symbols = text1.toCharArray();
        for (int i = 0; i < symbols.length; i++){
            System.out.println(symbols[i]);
        }

        //zad 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        if (weight >= 50 && weight <= 70)
            System.out.println("You are skinny! ");
        else if (weight >= 71 && weight <= 90)
            System.out.println("You are skinny fat! ");
        else if (weight >= 90 && weight <= 110)
            System.out.println("You are obese! ");
        else if (weight >= 111)
            System.out.println("You are extra obese");

        //zad 5
        System.out.println("Days of the week: ");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }




        }
    }