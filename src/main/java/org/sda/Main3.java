package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        // -------GENERIC TYPE---------
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); //converting double to BigDecimal

        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);

        genericFoodWithFruit.getItem();
        System.out.println(genericFoodWithFruit.getItem());

        String str = "I'm a great developer!";
        GenericFood<String> GenericFoodWithString = new GenericFood<>(str);
        System.out.println(GenericFoodWithString.getItem());

        GenericFoodWithString.setItem("i'm a good person!");
        System.out.println(GenericFoodWithString.getItem());



        //--------GENERIC TYPE - EXTENDS--------------
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood= new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());


        //--------GENERIC TYPE- INTERFACE------------

        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(4);
        System.out.println("Snack 1 = "+snack1.isBetter(snack2)
        + "\nSnack 2 = "+ snack2.isBetter(snack1));

        //---LIST----

        List<String> animalList = new ArrayList<>();
        animalList.add("Lion");  //index 0
        animalList.add("Tiger");    //index 1
        animalList.add("Dog");      //index 2
        animalList.add("Me");       //index 3
        animalList.add("Rat");
        animalList.add("Bazooka");
        animalList.add("souljab0y");
        animalList.add("shawty");



        System.out.println(animalList.get(1));

        animalList.remove(3); //removes element from array list
        animalList.remove("Dog");

        for (String animal: animalList) {
            System.out.println(animal);
        }

        Iterator<String> stringIterator = animalList.listIterator();

        while(stringIterator.hasNext()) {
            System.out.println(stringIterator.next()+" ,");

        }

        // Different way to remove from list using a different list.
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Rat");
        removeAnimalList.add("Bazooka");

        animalList.removeAll(removeAnimalList);

        for (String animal: animalList) {
            System.out.println(animal);
        }




    }

}
