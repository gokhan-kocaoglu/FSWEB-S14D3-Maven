package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("------------------------------------");

        CarSkeleton gasCar = new GasPoweredCar("Toyota Corolla", "Gasoline sedan", 17.5, 4);
        CarSkeleton electricCar = new ElectricCar("Tesla Model 3", "Electric sedan", 450, 75);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Hybrid hatchback", 24, 20, 4);

        // Polymorphism: Her objede startEngine(), drive(), runEngine() çağrılır ve override'lı metotlar çalışır
        testCarBehavior(gasCar);
        testCarBehavior(electricCar);
        testCarBehavior(hybridCar);
    }

    public static void testCarBehavior(CarSkeleton car) {
        System.out.println("----------");
        System.out.println("Testing car type: " + car.getClass().getSimpleName());
        System.out.println("Name: " + car.getName());
        System.out.println("Description: " + car.getDescription());
        car.startEngine();
        car.drive();
        System.out.println("----------\n");
    }
}