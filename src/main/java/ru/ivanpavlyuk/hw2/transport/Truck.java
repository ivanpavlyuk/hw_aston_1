package ru.ivanpavlyuk.hw2.transport;

public class Truck extends Transport implements CargoCarriable {
    private Wheel wheel;
    private double maxCargoWeightKilos;

    public Truck(Wheel wheel, double maxCargoWeightKilos) {
        this.wheel = wheel;
        this.maxCargoWeightKilos = maxCargoWeightKilos;
    }

    @Override
    public double getMaxCargoWeightKilos() {
        return maxCargoWeightKilos;
    }
}
