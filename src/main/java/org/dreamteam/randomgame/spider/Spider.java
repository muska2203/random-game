package org.dreamteam.randomgame.spider;

public class Spider {
    /**
     * Количество паутины в метрах.
     */

    private int weave = 500;
    public int weight = 100;

    public void weaveWeb(Insect insect1, Insect insectButterfly, Insect insectCockroach, Insect insect) {
        this.weave += insect.getWeave();
        System.out.println("Сейчас у паука " + weave + "метров паутины");
    }

    /**
     * Ловит насекомое в сеть.
     * @param insect насекомое, которое должно быть поймано пауком.
     */

    public void catchInsect(Insect insect) {
        this.weight += insect.getWeight();
        this.weave += insect.getWeave();
        System.out.println("Паук потолстел на " + weight);
        System.out.println("Теперь у паука " + weave + " паутинки");
        if (weight == 500) {
            throw new RuntimeException("I'm going to explode!!!!!");
        }
        if (weave == 4000) {
            throw new RuntimeException("Too much!!!!!");
        }
    }
}