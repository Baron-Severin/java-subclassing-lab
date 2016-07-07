package com.example.severinrudie.java_subclassing_lab;

public abstract class Bird extends Animal {

    boolean mHasFeathers;
    boolean mCanFly;

    public Bird (String picture, String species, String habitat) {
        super(picture, species, habitat);
        this.setHasFeathers(true);
        this.setNoise("SQUAAAAK");
    }

    // Getters and Setters
    public boolean getCanFly() {
        return mCanFly;
    }

    public void setCanFly(boolean mCanFly) {
        this.mCanFly = mCanFly;
    }

    public boolean getHasFeathers() {
        return mHasFeathers;
    }

    public void setHasFeathers(boolean mHasFeathers) {
        this.mHasFeathers = mHasFeathers;
    }
}
