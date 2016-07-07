package com.example.severinrudie.java_subclassing_lab;

public class KomodoDragon extends Reptile {

    public KomodoDragon (String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setHasLegs(true);
    }

}
