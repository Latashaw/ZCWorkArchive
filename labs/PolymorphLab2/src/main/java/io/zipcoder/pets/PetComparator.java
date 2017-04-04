package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by latashawatson on 2/1/17.
 */
public class PetComparator implements Comparator<Pet>{

//    @Override
//    public int compare(Object o1, Object o2) {
//        Pet pet1 = (Pet) o1;
//        Pet pet2 = (Pet) o2;
//
//        return 0;
//    }


    @Override
    public int compare(Pet pet1, Pet pet2) {
        int value = pet1.getType().compareTo(pet2.getType());
        if(value == 0) {
            value = pet1.getName().compareTo(pet2.getName());
        }
        return value;
    }
}
