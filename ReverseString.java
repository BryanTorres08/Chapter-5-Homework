/**
 *
 * Class: ReverseString
 * @Author: Bryan Torres
 * Version: 1.0
 * Course: ITEC 2140 Section 13 Spring 2024
 * Description: This program will let user enter a string and return all the characters reversed.
 *
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a String to reverse");

        String str = sc.nextLine();

        str = reverseString(str);

        System.out.println(str);
    }

    private static String reverseString(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}
