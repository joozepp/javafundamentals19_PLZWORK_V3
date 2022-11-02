package org.sda.generics;

/**
 * Generic food Class
 * @author Joozepp
 */

public class GenericFood<T> {
    private T item; //private Fruit item;

    public GenericFood(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
