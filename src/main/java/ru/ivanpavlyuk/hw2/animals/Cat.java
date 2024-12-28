package ru.ivanpavlyuk.hw2.animals;

public class Cat extends Mammal implements HasWool {
    private Wool wool;

    public Cat(Spine spine, Wool wool) {
        super(Habitat.LAND, spine);
        this.wool = wool;
    }

    @Override
    public Wool getWool() {
        return wool;
    }
}
