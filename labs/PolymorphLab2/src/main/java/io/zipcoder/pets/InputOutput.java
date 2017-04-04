package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by latashawatson on 1/31/17.
 */
public class InputOutput {
    Comparator<Pet> petComparator = new PetComparator();
    Scanner scanner;
    private String petName;
    private String petType;
    //private int numberofPets;
    private String response;

    public InputOutput() {
        scanner = new Scanner(System.in);
    }

    /*private void flush() {
        scanner.nextLine();
    }*/

    public String promptUserForString(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

   /* public int promptUserForInteger(String prompt) {
        flush();
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

      public int askHowManyPets() {
        int numberOfPets = promptUserForInteger("How many pets do you have?");
        return numberOfPets;
    }*/

    public String askNameOfPet() {
        String userInput = promptUserForString("What is your pets name?");
        return userInput;
    }

    public String askTypeOfPet() {
        String userInput = promptUserForString("What is your pet type?");
        return userInput;
    }

    public String nextPetPrompt() {
        String userInput = promptUserForString("Do you have any other pets? [ yes ] [ no ]");
        return userInput;
    }

    /*public void printListOfPets(PetDataWarehouse petDataWarehouse) {
        for (Pet petInfo : petDataWarehouse.getPetsList()) {
            System.out.println(petInfo.getType() + " " + petInfo.getName());
        }
        //printPetArrayList(petDataWarehouse.getPetsList());
    }*/

    public void printPetArrayList(ArrayList<Pet> pets) {
        for (Pet pet : pets) {

            System.out.println(pet.getName() + " " + pet.speak());
        }
    }

    public void printArrayListSortByNameThenType(ArrayList<Pet> pets) {
        Collections.sort(pets);
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " " + pet.speak());
        }
    }

    public void printArrayListSortByTypeThenName(ArrayList<Pet> pets) {
        Collections.sort(pets, petComparator);
        for(Pet pet: pets) {
            System.out.println(pet.getName() + " " + pet.speak());
        }
    }

    public String askPrintFormat(){
        String userInput = promptUserForString("Would you like you pets listed in order by [ name ] [ type ] or [ default ]?");
        return userInput;
    }
    public void printFormat(ArrayList<Pet> pets){
        String userInput = askPrintFormat();
        switch(userInput.toLowerCase()) {
            case "name" : printArrayListSortByNameThenType(pets);
            break;
            case "type" : printArrayListSortByTypeThenName(pets);
            break;
            case "default" : printPetArrayList(pets);
            break;
            default:
                System.out.println("Invalid entry");
                printFormat(pets);
                break;
        }
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    /*public int getNumberofPets() {
        return numberofPets;
    }*/

    public String getResponse() {
        return response;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    /*public void setNumberofPets(int numberofPets) {
        this.numberofPets = numberofPets;
    }*/

    public void setResponse(String response) {
        this.response = response;
    }

}
