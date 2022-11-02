package org.sda.exceptions;

/**
 * Exception to handle if the person is not found
 * @author Joozepp
 */

public class PersonNotFoundException extends Exception{
    public PersonNotFoundException(String name) {
        super(String.format("The person (%s) is not found!", name));
    }

    public PersonNotFoundException(int age) {
        super(String.format("The person's (age: %d) is not found"));
    }
}
