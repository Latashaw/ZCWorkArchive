package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by latashawatson on 1/31/17.
 */
public class DinoTest {
    Dino dino;

    @Before
    public void setUp() {
        dino = new Dino("fluffy");
    }

    @Test
    public void speak(){
        String expected = "argghh";
        String actual = dino.speak();
        Assert.assertEquals("Values should be equal", expected, actual);
    }
}
