package ru.ivanpavlyuk.hw2.birds;

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
}
