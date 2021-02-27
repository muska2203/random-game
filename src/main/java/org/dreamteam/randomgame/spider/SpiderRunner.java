package org.dreamteam.randomgame.spider;

public class SpiderRunner {

    public static void main(String[] args) {
        Spider spider = new Spider();

        Insect insect = new Insect(50, 50);
        Insect insectMosquito = new Insect(50, 210);
        Insect insectCockroach = new Insect(300, 150);
        Insect insectButterfly = new Insect(100, 100);
        spider.catchInsect(insect);
        spider.catchInsect(insectMosquito);
        spider.catchInsect(insectCockroach);
        spider.catchInsect(insectButterfly);
        spider.weaveWeb(insect, insectButterfly, insectCockroach, insectMosquito);
        }
    }
