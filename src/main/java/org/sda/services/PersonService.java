package org.sda.services;

// PersonService interface to handle Person related operations


import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;

public interface PersonService {
    // In interface static field is allowed but normal fields are not
    static final int AVERAGE_AGE = 20;

    /**
     * To get the birth year of the Person
     *
     * @param age Age of the person
     * @return Birth year
     */
    int getPersonBirthYear(int age);


    /**
     * to get the full name of the person
     *
     * @param person Person model
     * @return
     */
    String getPersonFullName(Person person);

    /**
     * To find a Person by first name
     * @param firstName Firstname of a person
     * @return Person
     */

    Person findPersonByFirstName(String firstName) throws PersonNotFoundException;



    //static method is allowed
    static int getAverageAge() {
        return AVERAGE_AGE;
    }
}
