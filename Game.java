/**
 *
 * Class: Game
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will request user to enter their name and their high scores for the game to be printed.
 *
 */

import java.util.Scanner;

public class Game {

    private Scanner scanner;

    private String gameName;
    private int gameScore;

    public Game() {
        gameName = "";
        gameScore = 0;
        scanner = new Scanner(System.in);
    }

    public String readGameName() {
        System.out.println("Please enter the name for the game");
        gameName = scanner.nextLine();
        return gameName;
    }

    public void readGameScore(String gameName) {
        System.out.println("Please enter the score for " + gameName);
        gameScore = scanner.nextInt();

    }

    public void printScore() {
        System.out.println(gameName + " - " + gameScore);
    }

    public static void main(String[] args) {

        Game aGame = new Game();
        String name = aGame.readGameName();
        aGame.readGameScore(name);
        aGame.printScore();
    }
}