package org.sda.abstracts;

/**
 * an abstract Food class
 * @author Joozepp
 */

public abstract class Food {
    private String color;

    public Food(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat(); //can only define it here, but cannot write
                                //the implementation here.
                                //The implementation will be in the extending class(es).
}
