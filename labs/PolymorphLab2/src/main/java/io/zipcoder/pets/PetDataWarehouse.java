package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by latashawatson on 1/31/17.
 */
public class PetDataWarehouse {
    private ArrayList<Pet> petsList = new ArrayList<>();
    private int numberOfPets;


    public ArrayList<Pet> getPetsList() {
        return petsList;
    }


    public int getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public void addPet(Pet pet) {
        petsList.add(pet);
    }
}
