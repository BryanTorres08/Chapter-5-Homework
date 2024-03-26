/**
 *
 * Class: IsPalindrome
 * @Author: Bryan Torres
 * Version: 1.0
 * Course: ITEC 2140 Section 13 Spring 2024
 * Description: This program will return true if String passed to be a palindrome and if not then false.
 *
 */

public class IsPalindrome {

    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {
        String string = "GGC";
        boolean isPalindrome = isPalindrome(string);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
