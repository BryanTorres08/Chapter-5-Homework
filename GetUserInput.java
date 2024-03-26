/**
 *
 * Class: GetUserInput
 * @Author: Bryan Torres
 * Version: 1.0
 * Course: ITEC 2140 Section 13 Spring 2024
 * Description: This program will let user enter a string and return to be printed.
 *
 */

import java.util.Scanner;

public class GetUserInput {

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    public static void main(String[] args) {
        String input = getInput();
        System.out.println("The user entered: " + input);
    }
}