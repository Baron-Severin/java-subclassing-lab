package com.example.severinrudie.java_subclassing_lab;

public class Eagle extends Bird {

    public Eagle(String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setCanFly(true);
        this.setNoise("CAAAWW");
    }

}
