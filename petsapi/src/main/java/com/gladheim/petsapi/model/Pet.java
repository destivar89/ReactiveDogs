package com.gladheim.petsapi.model;

/**
 * Created by David on 30/12/15.
 */
public class Pet {

    private User foundBy;
    private Location foundLocation;
    private Date foundDate;
    private String pictureUrl;
    private String petType;
    private String race;
    private String description;

    public Location getFoundLocation() {
        return foundLocation;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public String getPetType() {
        return petType;
    }

    public String getRace() {
        return race;
    }

    public String getDescription() {
        return description;
    }

    public User getFoundBy() {
        return foundBy;
    }
}
