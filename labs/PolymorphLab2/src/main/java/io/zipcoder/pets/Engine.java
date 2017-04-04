package io.zipcoder.pets;

/**
 * Created by latashawatson on 1/31/17.
 */
public class Engine {
    InputOutput io = new InputOutput();
    PetGenerator petGenerator = new PetGenerator();
    PetDataWarehouse petDW = new PetDataWarehouse();
    String name;
    String type;
    String response;


    public void run() {
        type = io.askTypeOfPet();
        name = io.askNameOfPet();
        petDW.addPet(petGenerator.createPet(name, type));
        response = io.nextPetPrompt();
        loop(response);
        io.printFormat(petDW.getPetsList());
    }

    public void loop(String response) {
        switch (response) {
            case "yes":
                type = io.askTypeOfPet();
                name = io.askNameOfPet();
                petDW.addPet(petGenerator.createPet(name, type));
                response = io.nextPetPrompt();
                loop(response);
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid Entry");
                String nextResponse = io.nextPetPrompt();
                loop(nextResponse);
                break;

        }
    }
}
