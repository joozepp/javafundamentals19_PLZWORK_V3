package org.sda.abstracts;

/**
 * Vegetable class extending the abstract class.
 *
 * @author Joozepp
 */

public class Vegetable extends Food{
    public Vegetable(String color) {
        super(color);
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a "+  super.getColor() +" colored vegetable.");
    }
}
