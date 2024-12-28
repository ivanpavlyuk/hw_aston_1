package ru.ivanpavlyuk.hw2.birds;

class Penguin extends ColorfulBird implements Walkable {

    public Penguin() {
        super("Penguin", "Short feathers", "Black and white");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " cannot fly!");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is waddling.");
    }
}
