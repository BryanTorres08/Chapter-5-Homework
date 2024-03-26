/**
*
* Class: SumOfNumbers
* @Author: Bryan Torres
* @Verison: 1.0
* Course: ITEC2140 Section 13 Spring 2024
* Description: This program will add two integer numbers together and display the sum.
*
 */

import java.util.Scanner;

public class SumOfNumbers {
    private Scanner input;

    public SumOfNumbers() {
        input = new Scanner(System.in);
    }

    public int sumNum(int first, int second) {
        return first + second;
    }

    public int getNumber() {
        System.out.println("Please enter an integer:");
        return input.nextInt();
    }

    public static void main(String[] args) {
        SumOfNumbers calculator = new SumOfNumbers();

        int firstNumber = calculator.getNumber();
        int secondNumber = calculator.getNumber();

        int result = calculator.sumNum(firstNumber, secondNumber);

        System.out.println("The sum is " + result);
    }
}