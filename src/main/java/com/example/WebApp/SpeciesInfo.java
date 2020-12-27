package com.example.WebApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SpeciesInfo {
//initiate Variables
    private int SpecId;
    private String Species;
    private String FeedingType;
    private int quantity;
    private String Description;
    private int LocationID;


    protected SpeciesInfo(int SpecId, String Species, String FeedingType, int quantity, String Description, int LocationID) {
        super();
        this.SpecId = SpecId;
        this.Species = Species;
        this.FeedingType = FeedingType;
        this.quantity = quantity;
        this.Description = Description;
        this.LocationID = LocationID;
    }

    protected SpeciesInfo() {

    }

    // GETTERS AND SETTERS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSpecId() {
        return SpecId;
    }

    public void setSpecId(int SpecId) {
        this.SpecId = SpecId;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public String getFeedingType() {
        return FeedingType;
    }

    public void setFeedingType(String FeedingType) {
        this.FeedingType = FeedingType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int LocationID) {
        this.LocationID = LocationID;
    }
}
