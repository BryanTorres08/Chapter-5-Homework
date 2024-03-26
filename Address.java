/**
 *
 * Class: Address
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will request user address and return printed.
 *
 */

import java.util.Scanner;

public class Address {
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    public void nameAddress() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name");
        name = input.nextLine();
        System.out.println("Please enter the address for " + name);
        streetAddress = input.nextLine();
    }


    public void cityState() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the city for " + name);
        city = input.nextLine();
        System.out.println("Please enter the state for " + name);
        state = input.nextLine();
    }


    public void printAddress() {
        System.out.println(name);
        System.out.println(streetAddress);
        System.out.println(city + ", " + state);
    }

    public static void main(String[] args) {
        Address user = new Address();


        user.nameAddress();
        user.cityState();

        user.printAddress();
    }
}
