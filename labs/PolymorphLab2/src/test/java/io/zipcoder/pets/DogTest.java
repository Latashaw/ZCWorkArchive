package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by latashawatson on 1/31/17.
 */
public class DogTest {
    Dog dog;

    @Before
    public void setUp() {
        dog = new Dog("fluffy");
    }

    @Test
    public void speak() {
        String expected = "rooof";
        String actual = dog.speak();
        Assert.assertEquals("Values should be equal", expected, actual);
    }
}
