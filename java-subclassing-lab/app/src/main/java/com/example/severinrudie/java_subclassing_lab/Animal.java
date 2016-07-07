package com.example.severinrudie.java_subclassing_lab;

public abstract class Animal {

    String mPicture;
    String mSpecies;
    String mHabitat;
    String mId;
    boolean mExtinct;
    int mEyes;
    String mNoise;

    public Animal(String mPicture, String species, String habitat) {
        setExtinct(false);
        setEyes(2);

        this.setPicture(mPicture);
        this.setSpecies(species);
        this.setId(Integer.toString(species.hashCode()));
        this.setHabitat(habitat);
    }

    // Getters and Setters
    public String getSpecies() {
        return mSpecies;
    }

    public void setSpecies(String mSpecies) {
        this.mSpecies = mSpecies;
    }

    public String getHabitat() {
        return mHabitat;
    }

    public void setHabitat(String mHabitat) {
        this.mHabitat = mHabitat;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public boolean ismExtinct() {
        return mExtinct;
    }

    public void setExtinct(boolean mExtinct) {
        this.mExtinct = mExtinct;
    }

    public String getPicture() {
        return mPicture;
    }

    public void setPicture(String picture) {
        this.mPicture = picture;
    }

    public int getEyes() {
        return mEyes;
    }

    public void setEyes(int mEyes) {
        this.mEyes = mEyes;
    }

    public String getNoise() {
        return mNoise;
    }

    public void setNoise(String noise) {
        this.mNoise = noise;
    }

    // Action Methods




}