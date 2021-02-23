package org.dreamteam.randomgame;

public class RandomGameStarter {

    public static void main(String[] args) {
        System.out.println("Игра началась!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Игра закончилась, никто не выйграл!");
    }
}
