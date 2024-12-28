package ru.ivanpavlyuk.hw2.birds;

abstract class Bird extends Animal implements Flyable {
    private String feathers;

    public Bird(String name, String feathers) {
        super(name);
        this.feathers = feathers;
    }

    public String getFeathers() {
        return feathers;
    }

    public void showFeathers() {
        System.out.println(this.getName() + " has " + this.getFeathers().toLowerCase());
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying.");
    }
}
