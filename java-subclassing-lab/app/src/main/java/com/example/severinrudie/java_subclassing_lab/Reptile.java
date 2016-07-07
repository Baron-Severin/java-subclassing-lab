package com.example.severinrudie.java_subclassing_lab;

public abstract class Reptile extends Animal {

    boolean canWalk;

    public Reptile (String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setNoise("HISSSS");
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setHasLegs(boolean canWalk) {
        this.canWalk = canWalk;
    }
}
