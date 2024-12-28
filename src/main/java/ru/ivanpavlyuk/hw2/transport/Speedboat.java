package ru.ivanpavlyuk.hw2.transport;

public class Speedboat extends Transport implements CargoCarriable {
    private Screw screw;
    private double maxCargoWeightKilos;

    public Speedboat(Screw screw, double maxCargoWeightKilos) {
        this.screw = screw;
        this.maxCargoWeightKilos = maxCargoWeightKilos;
    }

    @Override
    public double getMaxCargoWeightKilos() {
        return maxCargoWeightKilos;
    }
}
