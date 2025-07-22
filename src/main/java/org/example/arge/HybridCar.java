package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " (Hybrid) engine starts: " + cylinders + " cylinders, " + batterySize + " kWh battery.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " (Hybrid) is running. Avg " + avgKmPerLitre + " km/l, battery: " + batterySize + " kWh.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " (Hybrid) engine & motor running together.");
    }
}
