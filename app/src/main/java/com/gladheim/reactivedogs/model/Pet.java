package com.gladheim.reactivedogs.model;

import android.location.Location;

import java.util.Date;

/**
 * Created by David on 30/12/15.
 */
public class Pet {

    private User foundBy;
    private Location foundLocation;
    private Date foundDate;
    private String pictureUrl;
    private PetType petType;
    private String race;
    private String description;

    public User getFoundBy() {
        return foundBy;
    }

    public Location getFoundLocation() {
        return foundLocation;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public PetType getPetType() {
        return petType;
    }

    public String getRace() {
        return race;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle(){
        return petType.toString() + " found";
    }

}
