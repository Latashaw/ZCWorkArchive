package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by latashawatson on 2/2/17.
 */
public class PetComparatorTest {
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
        PetComparator petComp = new PetComparator();

        // Act
        int actualValue = petComp.compare(pet1, pet2);
        boolean valueIsNegative = actualValue < 0;

        // Assert
        Assert.assertTrue(valueIsNegative);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyLower_ShouldReturnPositiveValue() {
        // Arrange
        Pet pet1 = new Pet("sula");
        Pet pet2 = new Pet("Min");
        PetComparator petComp = new PetComparator();

        // Act
        int actualValue = petComp.compare(pet1, pet2);
        boolean valueIsPositive = actualValue > 0;

        // Assert
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualAndClassNameIsAlphabeticallyHigher_ShouldReturnNegative() {
        // Arrange
        Pet pet1 = new Dino("Min");
        Pet pet2 = new Pet("Min");
        PetComparator petComp = new PetComparator();

        // Act
        int actualValue = petComp.compare(pet1, pet2);
        boolean valueIsNegative = actualValue < 0;

        // Assert
        Assert.assertTrue(valueIsNegative);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualAndClassNameIsAlphabeticallyLower_ShouldReturnPositive() {
        // Arrange
        Pet pet1 = new Pet("Min");
        Pet pet2 = new Dino("Min");
        PetComparator petComp = new PetComparator();

        // Act
        int actualValue = petComp.compare(pet1, pet2);
        boolean valueIsPositive = actualValue > 0;

        // Assert
        Assert.assertTrue(valueIsPositive);
    }

    @Test
    public void compareTo_InputIsAlphabeticallyEqualAndClassNameIsEqual_ShouldReturnZero() {
        // Arrange
        Pet pet1 = new Pet("Min");
        Pet pet2 = new Pet("Min");
        PetComparator petComp = new PetComparator();

        // Act
        int actualValue = petComp.compare(pet1, pet2);

        // Assert
        Assert.assertEquals(0, actualValue);
    }

}
