/**
 *
 * Class: EvenNumber
 * @Author: Bryan Torres
 * Version: 1.0
 * Course: ITEC 2140 Section 13 Spring 2024
 * Description: This program will decide if the user integer is even or not.
 *
 */

import java.util.Scanner;

public class EvenNumber {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printEven(boolean isEven) {
        if (isEven) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isEven = isEven(number);
        printEven(isEven);
    }
}
