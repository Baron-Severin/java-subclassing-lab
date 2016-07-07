package com.example.severinrudie.java_subclassing_lab;

public class Emu extends Bird {

    public Emu(String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setCanFly(false);
    }

}
