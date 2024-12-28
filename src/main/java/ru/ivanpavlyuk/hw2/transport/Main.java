package ru.ivanpavlyuk.hw2.transport;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Plane(new Wheel(4, 75),
                new Screw(2, 55),
                new Wing(2, 7),
                50_000);
        System.out.println(((CargoCarriable) transport).getMaxCargoWeightKilos());
    }
}
