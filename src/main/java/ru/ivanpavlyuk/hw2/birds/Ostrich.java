package ru.ivanpavlyuk.hw2.birds;

class Ostrich extends Bird implements Walkable {
    public Ostrich() {
        super("Ostrich", "Medium feathers");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " cannot fly!");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is walking.");
    }
}
