package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by latashawatson on 1/31/17.
 */
public class Pet implements Comparable<Pet> {
    private String name;

    public Pet(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }


    public String speak() {
        return "skornk sluginshft";
    }

//    @Override
//    public int compareTo(Object o) {
//        Pet pet = (Pet) o;
//        int value = this.name.compareTo(pet.getName());
//        if(value == 0) {
//            value = this.getType().compareTo(pet.getType());
//        }
//        return value;
//    }

    public String getType() {
        return "Pet";
    }

    @Override
    public int compareTo(Pet o) {
        int value = this.name.compareTo(o.getName());
        if(value == 0) {
            value = this.getType().compareTo(o.getType());
        }
        return value;
    }
}
