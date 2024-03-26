/**
 *
 * Class: RectangleSize
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will request user to enter height and width to decide the size of the rectangle.
 *
 */

import java.util.Scanner;

public class RectangleSize {

    private int side1, side2;

    private Scanner input;

    public void getSides() {
        input = new Scanner(System.in);
        System.out.println("Please enter side 1");
        side1 = input.nextInt();
        System.out.println("Please enter side 2");
        side2 = input.nextInt();
    }

    public int getArea() {
        return side1 * side2;
    }

    public boolean isLarge() {
        int area = getArea();
        return area > 400;
    }

    public void printSize(boolean large) {
        if (large)
            System.out.println("This is a large rectangle.");
        else
            System.out.println("This is a small rectangle.");
    }

    public static void main(String[] args) {
        RectangleSize rs = new RectangleSize();
        rs.getSides();
        boolean large = rs.isLarge();
        rs.printSize(large);
    }
}

