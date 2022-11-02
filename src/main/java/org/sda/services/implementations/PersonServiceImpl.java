package org.sda.services.implementations;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;
import java.util.List;

public class PersonServiceImpl implements PersonService {
    @Override
    public int getPersonBirthYear(int age) {
        return LocalDate.now().getYear() - age;

    }

    @Override
    public String getPersonFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    @Override
    public Person findPersonByFirstName(String firstName) throws PersonNotFoundException {
        Person resultPerson=null;

        //search a person with a given firstname from random list.
        for(Person person: getRandomPersonList()){
            if(person.getFirstName().equals(firstName)){
                resultPerson = person;
                break;
            }
        }
        // if the person is not found, then throw an exception.
        if(resultPerson== null) {
            throw new PersonNotFoundException(firstName);
        }

        return resultPerson;
    }

    //PRIVATE METHODS//
    private List<Person> getRandomPersonList() {
    Person person1 = new Person();
    person1.setFirstName("Jana");
    person1.setLastName("Fookel");
    person1.setAge(111111);

    Person person2 = new Person();
    person2.setFirstName("Mister");
    person2.setLastName("Proper");
    person2.setAge(22222);

    Person person3 = new Person();
    person3.setFirstName("ALI");
    person3.setLastName("G");
    person3.setAge(69);

    Person person4 = new Person();
    person4.setFirstName("Joozep");
    person4.setLastName("Poozep");
    person4.setAge(44444);

    return List.of(person1,person2,person3,person4);

    }
}
