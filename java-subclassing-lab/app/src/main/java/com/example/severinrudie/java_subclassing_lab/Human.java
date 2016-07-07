package com.example.severinrudie.java_subclassing_lab;

public class Human extends Mammal {

    public Human(String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setNoise("I'm so tired all the time");
    }
}
