package practice.day3.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class day3 {
    public static void exercise1 (int[] array){
        int[] array_Positives = new int[array.length];
        int[] array_Negatives = new int[array.length];
        for (int i = 0; i < array.length;i++){
            if (array[i] > 0){
                array_Positives[i] = array[i];
            }
            else if (array[i] < 0){
                array_Negatives[i] = array[i];
            }
        }
        int[] array_Even = new int[array.length];
        int[] array_Odd = new int[array.length];
        for (int i = 0; i < array.length;i++){
            if (array[i] % 2 == 0){
                array_Even[i] = array[i];
            }
            else if (array[i] % 2 != 0){
                array_Odd[i] = array[i];
            }
        }
        int[] array_Fifths = new int[array.length];
        for (int i = 0; i < array.length;i++){
            if (array[i] == 5 || array[i] == -5){
                array_Fifths[i] = array[i];
            }
        }
        System.out.println("Positive numbers are: ");
        for (int i = 0; i < array_Positives.length;i++){
            System.out.println(array_Positives[i]);
        }
        System.out.println("Negatives numbers are: ");
        for (int i = 0; i < array_Negatives.length;i++){
            System.out.println(array_Negatives[i]);
        }
        System.out.println("Even numbers are: ");
        for (int i = 0; i < array_Even.length;i++){
            System.out.println(array_Even[i]);
        }
        System.out.println("Odd numbers are: ");
        for (int i = 0; i < array_Odd.length;i++){
            System.out.println(array_Odd[i]);
        }
        System.out.println("Fifth's numbers are: ");
        for (int i = 0; i < array_Fifths.length;i++){
            System.out.println(array_Fifths[i]);
        }

    }
    public static void exercise2(String str, String str1){

        System.out.println(str.replace(str1, ""));

    }
    public static void exercise3(String str){
        String[] sentence = str.split(" ");
        for (int i = sentence.length - 1; i>=0; i--){
            System.out.print(sentence[i] + " ");
        }
    }
    public static void exercise4(String str){
        String[] init = str.split(" ");
        for (int i = 0; i < init.length; i++){
            System.out.println(init[i].charAt(0));
        }
    }
    public static void exercise5(ArrayList<String> list){
        String first = list.get(0);
        String last = list.get(list.size() - 1);
        list.set(0, last);
        list.set(list.size() - 1, first);
        System.out.println(list);
    }

    public static void main(String[] args) {
        //zad 1
        int[] array = new int[] {10, 2, -1, 1, 5, 9, 7, 6, 5, -5};
        exercise1(array);

        //zad 2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = input.nextLine();
        System.out.println("Enter another word: ");
        String str1 = input.nextLine();
        exercise2(str, str1);

        //zad 3
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        exercise3(sentence);

        //zad 4
        System.out.println();
        System.out.println("Enter a name: ");
        String name = input.nextLine();
        System.out.println("Initials are: ");
        exercise4(name);;

        //zad 5
        ArrayList<String> list = new ArrayList<String>();
        list.add("I");
        list.add("am");
        list.add("Safet");
        exercise5(list);
    }
}
