package ru.ivanpavlyuk.hw2.birds;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bird bird = (Bird) o;
        return Objects.equals(feathers, bird.feathers);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(feathers);
        return result;
    }
}
