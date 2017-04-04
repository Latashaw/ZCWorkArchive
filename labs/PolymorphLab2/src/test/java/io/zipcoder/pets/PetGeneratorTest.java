package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
/**
 * Created by latashawatson on 1/31/17.
 */
public class PetGeneratorTest {
    PetGenerator petGen;
    Pet pet;
    Cat cat;
    Dog dog;
    Dino dino;

    @Before
    public void setup(){
        petGen = new PetGenerator();
        pet = new Pet("fluffy");
        cat = new Cat("fluffy");
        dog = new Dog("fluffy");
        dino = new Dino("fluffy");
    }


    @Test
    public void createPetOfPetTest(){
        String expected = "skornk sluginshft";
        petGen.createPet("fluffy", "Pet");
        String actual = pet.speak();
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void createPetOfCatTest(){
        String expected = "meow";
        petGen.createPet("fluffy", "Cat");
        String actual = cat.speak();
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void createPetOfDogTest(){
        String expected = "rooof";
        petGen.createPet("fluffy", "Dog");
        String actual = dog.speak();
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void createPetOfDinoTest(){
        String expected = "argghh";
        petGen.createPet("fluffy", "Dino");
        String actual = dino.speak();
        Assert.assertEquals("Values should be equal", expected, actual);
    }

}
