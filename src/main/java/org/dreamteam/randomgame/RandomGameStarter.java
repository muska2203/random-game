package org.dreamteam.randomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGameStarter {

    public static final int MAX_GAME_POINTS = 10;

    public static int pointOfComputer = 0;
    public static int pointOfPlayer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean gameIsRunning = true;
        int turnCounter = 0;
        while (gameIsRunning) {
            turnCounter++;
            boolean turnPlayer = turnCounter % 2 == 0;
            Random random = new Random();
            int numberOfComputer = random.nextInt(10) + 1;
            System.out.println(numberOfComputer);
            int numberOfPlayer = Integer.parseInt(in.readLine());
            if (numberOfPlayer == numberOfComputer) {
                if (turnPlayer) {
                    System.out.println("Молодец, у тебя получилось");
                    pointOfPlayer++;
                    System.out.println("Очко игроку " + pointOfPlayer);
                } else {
                    System.out.println("Попробуй ещё раз");
                    pointOfComputer++;
                    System.out.println("Очко компьютеру");
                }
            } else {
                if (turnPlayer) {
                    System.out.println("Увы, но компьютер умнее тебя");
                    pointOfComputer++;
                    System.out.println("Очко компьютеру " + pointOfComputer);
                } else {
                    System.out.println("Мозг человека всё таки умнее компьютера");
                    pointOfPlayer++;
                    System.out.println("Очко игроку " + pointOfPlayer);
                }
            }
            gameIsRunning = pointOfComputer != MAX_GAME_POINTS && pointOfPlayer != MAX_GAME_POINTS;
        } if (pointOfPlayer == MAX_GAME_POINTS){
            System.out.println("Победил игрок");
        } else {
            System.out.println("Победил компьютер");
        }

    }
}




