package org.dreamteam.randomgame.spider;

public class Insect {

    /**
     * Вес насекомого в милиграммах.
     */
    private final double weight;
    private final double weave;

    public Insect(double weight, double weave) {
        this.weight = weight;
        this.weave = weave;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getWeave() {
        return this.weave;
    }
}