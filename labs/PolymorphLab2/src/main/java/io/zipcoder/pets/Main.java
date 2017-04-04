package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by latashawatson on 1/31/17.
 */
public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.run();
    }

}


//        ArrayList<Pet> pets = new ArrayList<>();
//        pets.add(new Dog("Min"));
//        pets.add(new Dog("Sula"));
//        pets.add(new Cat("Min"));
//
//        Comparator<Pet> petComparator = new PetComparator();
//
//        for(Pet pet: pets) {
//            System.out.println(pet.getType() + " " + pet.getName());
//        }
//
//        Collections.sort(pets);
//
//        for(Pet pet: pets) {
//            System.out.println(pet.getType() + " " + pet.getName());
//        }
//
//        Collections.sort(pets, petComparator);
//
//        for(Pet pet: pets) {
//            System.out.println(pet.getType() + " " + pet.getName());
//        }


//        pets.get(0).getName() == "min";
//        pets.get(1).getName()
//        Pet min = new Dog("Min");
//        Pet dino = new Dino("Min");
//
//        System.out.println(min.compareTo(dino));
//        System.out.println(dino.compareTo(min));

