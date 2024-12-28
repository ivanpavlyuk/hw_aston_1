package ru.ivanpavlyuk.hw2.transport;

public class Plane extends Transport implements CargoCarriable {
    private Wheel wheel;
    private Screw screw;
    private Wing wing;
    private double maxCargoWeightKilos;

    public Plane(Wheel wheel, Screw screw, Wing wing, double maxCargoWeightKilos) {
        this.wheel = wheel;
        this.screw = screw;
        this.wing = wing;
        this.maxCargoWeightKilos = maxCargoWeightKilos;
    }

    @Override
    public double getMaxCargoWeightKilos() {
        return maxCargoWeightKilos;
    }
}
