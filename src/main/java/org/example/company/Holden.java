package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + ": Holden engine starts smoothly!";
        System.out.println(message);
        return message;
    }

    @Override
    public String accelerate() {
        String message = getClass().getSimpleName() + ": Holden accelerates quickly!";
        System.out.println(message);
        return message;
    }

    @Override
    public String brake() {
        String message = getClass().getSimpleName() + ": Holden slows down!";
        System.out.println(message);
        return message;
    }
}
