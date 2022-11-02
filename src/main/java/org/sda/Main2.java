package org.sda;

import org.sda.abstracts.Fruit;
import org.sda.abstracts.Vegetable;
import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

public class Main2 {
    public static void main(String[] args) throws PersonNotFoundException {

        Fruit fruit = new Fruit("Red");
        fruit.eat();

        Vegetable veggie = new Vegetable("vomit");
        veggie.eat();

        //INTERFACE
        Person person = new Person();
        person.setFirstName("Joosep");
        person.setLastName("Poozep");
        person.setAge(2147483647);

        //left side sould be interface name and right side should be interfaces implemetation class name.
        PersonService personService = new PersonServiceImpl();

        // implementation method calls
        System.out.println("Person's birth year: " + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Person's full name is: " + personService.getPersonFullName(person));
        System.out.println("persons last name is: " + person.getLastName());


        //EXCEPTION
        try {
            int[] intArray = {1, 2, 34, 6};

            for (int i = 0; i <= intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The number cannot be printed because its not in the array!");
        } catch (Exception ex) {
            System.out.println("u fugged up m8");
        } finally {  // THIS BLOCK WILL BE EXECUTED nomatter the CATCH.
            int a = 15;
            System.out.println("Finally excevcuted, a: " + a);

            //combining multiple exceptions
            try {
                int y = 10 / 0; //this line should throw an exception
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
                System.out.println("u fugged up m8 :DDDDDDDDDD?????? (the value of Y is not determined)" + e.getLocalizedMessage());
            }
        }
        //Custmon / User-defined exceptions.
        Person testPerson = null;
        try {
            person = personService.findPersonByFirstName("dawg");
            System.out.println(person.toString());
        } catch (PersonNotFoundException e) {
            System.out.println(e.getLocalizedMessage());

            testPerson = new Person();
            testPerson.setFirstName("Unknown");
            testPerson.setLastName("Unknown last");
            testPerson.setAge(10);
            //ALT CODE
        }
        System.out.println(testPerson.toString());
    }


}