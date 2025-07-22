package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + ": Mitsubishi engine roars to life!";
        System.out.println(message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = getClass().getSimpleName() + ": Mitsubishi is speeding up!";
        System.out.println(message);
        return message;
    }

    @Override
    public String brake() {
        String message = getClass().getSimpleName() + ": Mitsubishi applies brakes!";
        System.out.println(message);
        return message;
    }
}
