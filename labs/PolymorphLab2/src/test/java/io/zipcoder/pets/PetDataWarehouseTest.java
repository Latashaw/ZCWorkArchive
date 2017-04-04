package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by latashawatson on 1/31/17.
 */
public class PetDataWarehouseTest {
    PetDataWarehouse petDataWarehouse;

    @Before
    public void setup() {
        petDataWarehouse = new PetDataWarehouse();
    }



    @Test
    public void addPet() {
        Pet expected = new Pet("yolo");
        petDataWarehouse.addPet(expected);
        ArrayList<Pet> pets = petDataWarehouse.getPetsList();
        Assert.assertEquals("Comparing size of ArrayLists", 1 ,pets.size());
        Pet actual = pets.get(0);
        Assert.assertEquals("Values should be equal", expected, actual);

    }

}
