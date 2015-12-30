package com.gladheim.petsapi.model;

/**
 * Created by David on 30/12/15.
 */
public enum PetType {
    DOG("dog"),
    CAT("cat"),
    BUNNY("bunny");


    private final String text;

    private PetType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
