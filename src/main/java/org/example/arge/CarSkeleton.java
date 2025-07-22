package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
        this("DefaultName", "DefaultDescription");
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting.");
    }

    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving.");
        runEngine();
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " engine is running.");
    }
}
