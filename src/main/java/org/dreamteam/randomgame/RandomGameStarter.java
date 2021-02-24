package org.dreamteam.randomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGameStarter {

    public static final int MAX_GAME_POINTS = 5;

    public static int pointOfComputer = 0;
    public static int pointOfPlayer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean gameIsRunning = true;
        while (gameIsRunning) {
            Random random = new Random();
            int numberOfComputer = random.nextInt(10);
            numberOfComputer += 1;
            System.out.println(numberOfComputer);
            int numberOfPlayer = Integer.parseInt(in.readLine());
            if (numberOfPlayer == numberOfComputer) {
                System.out.println("Молодец, у тебя получилось!");
                pointOfPlayer = pointOfPlayer + 1;
                System.out.println("Очко игроку " + pointOfPlayer);
                gameIsRunning = pointOfComputer != MAX_GAME_POINTS && pointOfPlayer != MAX_GAME_POINTS;
            } else {
                pointOfComputer = pointOfComputer + 1;
                System.out.println("Попробуй ещё раз");
                System.out.println("Очко компьютеру " + pointOfComputer);
                gameIsRunning = pointOfComputer != MAX_GAME_POINTS && pointOfPlayer != MAX_GAME_POINTS;
            }
        }
        pointOfPlayer = 0;
        pointOfComputer = 0;
        gameIsRunning = true;
        while (gameIsRunning) {
            Random random = new Random();
            int numberOfPlayer = Integer.parseInt(in.readLine());
            int numberOfComputer = random.nextInt();
            System.out.println(numberOfComputer);
            if (numberOfComputer == numberOfPlayer) {
                System.out.println("Увы, но компьютер умнее тебя");
                pointOfComputer = pointOfComputer + 1;
                System.out.println("Очко компьютеру " + pointOfComputer);
                gameIsRunning = pointOfComputer != MAX_GAME_POINTS && pointOfPlayer != MAX_GAME_POINTS;
            }
        }
    }
}

