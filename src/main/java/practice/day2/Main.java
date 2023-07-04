package practice.day2;

import java.util.*;


public class Main {
    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
return sum;
    }
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
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
*/

//Homework
        //zad 1
        String[] words = {"Аватар", "алфа", "беда", "бреза", "салон"};
        for (String word : words){
            if (word.charAt(0) == 'а' || word.charAt(0) == 'А')
                System.out.println(word);
        }

        //zad 2
        Scanner num = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = num.nextInt();
        }
        System.out.println("Sum is " + sum(array));


        //zad 3
        ArrayList<String> list = new ArrayList<>();
        int n = 1;
        while(n <= 4){
            Scanner scann = new Scanner(System.in);
            System.out.println("Enter word: ");
            list.add(scann.nextLine());
            n++;
        }
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() <= 4)
                list.remove(i--);
        }
        System.out.println("Remaining words are: ");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        }


    }