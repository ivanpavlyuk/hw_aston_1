package ru.ivanpavlyuk.hw2.birds;

import java.util.Objects;

abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
