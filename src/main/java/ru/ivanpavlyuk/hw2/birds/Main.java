package ru.ivanpavlyuk.hw2.birds;

public class Main {
    public static void main(String[] args) {
        for (Bird bird : new Bird[]{
                new Ostrich(),
                new Canary(),
                new Thrush(),
                new Penguin()
        }) {
            bird.showFeathers();
            bird.fly();
            if (bird instanceof Walkable) {
                ((Walkable) bird).walk();
            } else {
                System.out.println(bird.getName() + " cannot walk.");
            }
            if (bird instanceof ColorfulBird) {
                ((ColorfulBird) bird).showColor();
            } else {
                System.out.println(bird.getName() + " doesn't have color even though it's impossible ))).");
            }
            if (bird instanceof Singable) {
                ((Singable) bird).sing();
            } else {
                System.out.println(bird.getName() + " cannot sing.");
            }

        }
    }
}

