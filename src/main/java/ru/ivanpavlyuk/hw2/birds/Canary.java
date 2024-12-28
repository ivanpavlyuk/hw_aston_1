package ru.ivanpavlyuk.hw2.birds;

class Canary extends ColorfulBird implements Singable {
    public Canary() {
        super("Canary", "Short feathers", "Yellow");
    }

    @Override
    public void sing() {
        System.out.println(this.getName() + " is singing.");
    }
}
