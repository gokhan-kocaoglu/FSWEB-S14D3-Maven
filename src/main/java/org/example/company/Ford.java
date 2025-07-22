package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + ": Ford engine is ready to go!";
        System.out.println(message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = getClass().getSimpleName() + ": Ford is accelerating powerfully!";
        System.out.println(message);
        return message;
    }

    @Override
    public String brake() {
        String message = getClass().getSimpleName() + ": Ford brakes applied!";
        System.out.println(message);
        return message;
    }
}
