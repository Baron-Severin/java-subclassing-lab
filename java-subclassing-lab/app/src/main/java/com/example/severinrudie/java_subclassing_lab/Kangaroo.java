package com.example.severinrudie.java_subclassing_lab;

public class Kangaroo extends Mammal {

    public Kangaroo(String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setNoise("[hissing, grunting, coughing]");
    }
}
