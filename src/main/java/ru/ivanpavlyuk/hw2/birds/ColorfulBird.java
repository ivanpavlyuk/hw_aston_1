package ru.ivanpavlyuk.hw2.birds;

import java.util.Objects;

abstract class ColorfulBird extends Bird implements Colorful {
    private String color;

    ColorfulBird(String name, String feathers, String color) {
        super(name, feathers);
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public void showColor() {
        System.out.println(this.getName() + " is " + this.getColor().toLowerCase() + " colored.");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ColorfulBird that = (ColorfulBird) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(color);
        return result;
    }
}
