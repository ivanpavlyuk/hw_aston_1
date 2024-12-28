package ru.ivanpavlyuk.hw2.animals;

public class Mammal extends Animal {
    private Spine spine;

    public Mammal(Habitat habitat, Spine spine) {
        super(habitat);
        this.spine = spine;
    }
}
