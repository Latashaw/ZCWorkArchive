package io.zipcoder.pets;

/**
 * Created by latashawatson on 1/31/17.
 */
public class Dino extends Pet {

    public Dino(String name) {
        super(name);
    }


    public String speak(){
    return "argghh";
    }

    @Override
    public String getType() {
        return "Dino";
    }
}
