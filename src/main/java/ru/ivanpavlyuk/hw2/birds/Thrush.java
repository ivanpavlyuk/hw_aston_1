package ru.ivanpavlyuk.hw2.birds;

class Thrush extends ColorfulBird implements Singable {
    public Thrush() {
        super("Thrush", "Short feathers", "Brown");
    }

    @Override
    public void sing() {
        System.out.println(this.getName() + " is singing.");
    }
}
