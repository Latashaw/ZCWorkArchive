package io.zipcoder.pets;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by latashawatson on 1/31/17.
 */
public class Cat extends Pet {

    public Cat(String name) {
       super(name);
    }

    public String speak() {
    return "meow";
    }

    @Override
    public String getType() {
        return "Cat";
    }
}