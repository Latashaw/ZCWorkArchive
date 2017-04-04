package io.zipcoder.pets;

/**
 * Created by latashawatson on 1/31/17.
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public String speak(){
    return "rooof";
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
