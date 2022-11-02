package org.sda.generics;

/**
 * Generic Comparable interface
 *
 * @author Joozepp
 */

public interface Comparable<T> {
    /**
     * Compare two objects fields and return the better object
     * @param item Generic
     * @return true or false
     */
    boolean isBetter(T item);


}
