package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by latashawatson on 1/31/17.
 */
public class CatTest {
    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat("fluffy");
    }

    @Test
    public void speak() {
        String expected = "meow";
        String actual = cat.speak();
        Assert.assertEquals("Values should be equal", expected, actual);
    }

}
