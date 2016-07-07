package com.example.severinrudie.java_subclassing_lab;

public class Anaconda extends Reptile {

    public Anaconda(String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setHasLegs(false);
    }

}
