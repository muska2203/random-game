package org.dreamteam.randomgame;

public class RandomGameStarter {

    public static final int MAX_GAME_POINTS = 5;

    public static void main(String[] args) {
        System.out.println("Игра началась!! Для победы нужно набрать " + MAX_GAME_POINTS + " очков");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Игра закончилась, никто не выйграл!");
    }
}
