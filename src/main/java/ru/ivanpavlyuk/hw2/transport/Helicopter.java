package ru.ivanpavlyuk.hw2.transport;

public class Helicopter extends Transport implements CargoCarriable {
    private Wheel wheel;
    private Screw screw;
    private double maxCargoWeightKilos;

    public Helicopter(Wheel wheel, Screw screw, double maxCargoWeightKilos) {
        this.wheel = wheel;
        this.screw = screw;
        this.maxCargoWeightKilos = maxCargoWeightKilos;
    }

    @Override
    public double getMaxCargoWeightKilos() {
        return maxCargoWeightKilos;
    }
}
