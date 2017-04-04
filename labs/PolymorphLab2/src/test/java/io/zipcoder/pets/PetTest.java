package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by latashawatson on 1/31/17.
 */
public class PetTest {

    @Test
    public void speakTest() {
        // Arrange
        Pet pet = new Pet("Min");
        String expectedValue = "skornk sluginshft";

        // Act
        String actualValue = pet.speak();

        // Assert
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyHigher_ShouldReturnNegativeValue() {
        // Arrange
        Pet pet1 = new Pet("Min");
        Pet pet2 = new Pet("Sula");

        // Act
        int actualValue = pet1.compareTo(pet2);
        boolean valueIsNegative = actualValue < 0;

        // Assert
        Assert.assertTrue(valueIsNegative);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyLower_ShouldReturnPositiveValue() {
        // Arrange
        Pet pet1 = new Pet("Min");
        Pet pet2 = new Pet("Sula");

        // Act
        int actualValue = pet2.compareTo(pet1);
        boolean valueIsPositive = actualValue > 0;

        // Assert
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualAndClassNameIsAlphabeticallyHigher_ShouldReturnNegative() {
        // Arrange
        Pet pet1 = new Dino("Min");
        Pet pet2 = new Pet("Min");

        // Act
        int actualValue = pet1.compareTo(pet2);
        boolean valueIsNegative = actualValue < 0;

        // Assert
        Assert.assertTrue(valueIsNegative);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualAndClassNameIsAlphabeticallyLower_ShouldReturnPositive() {
        // Arrange
        Pet pet1 = new Pet("Min");
        Pet pet2 = new Dino("Min");

        // Act
        int actualValue = pet1.compareTo(pet2);
        boolean valueIsPositive = actualValue > 0;

        // Assert
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualAndClassNameIsEqual_ShouldReturnZero() {
        // Arrange
        Pet pet1 = new Pet("Min");
        Pet pet2 = new Pet("Min");

        // Act
        int actualValue = pet1.compareTo(pet2);

        // Assert
        Assert.assertEquals(0, actualValue);
    }

    @Test
    public void getType() {
        // Arrange
        Pet pet = new Pet("Min");

        String expectedType = "Pet";

        // Act
        String actualType = pet.getType();

        // Assert
        Assert.assertEquals(expectedType, actualType);
    }
}
