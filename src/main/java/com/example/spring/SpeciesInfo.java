package com.example.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
  this the class for species info Table
 */
@Entity
public class SpeciesInfo {

    // initiate variables
    @Id
    private int specId;
    private String Species;

    private enum Class { // Enums are used when we know all possible values at compile time,
        Mammal, Fish, Reptile, Amphibian, Bird
    }
    private enum FeedingType
    {
        Herbivore, Carnivore, Omnivore
    }
    private int quantity; // get quantity
    private String Descriptor;
    private int LocationID;

    Class _class;
    FeedingType _feedType;

    public SpeciesInfo() {
        /*empty constructor*/
    }

    /*
    Constructor
     */
    public SpeciesInfo(int specId,String Species, Class _class, FeedingType _feedType,
                       int quantity, String Descriptor, int LocationID){
        /*
        Constructor assigning variables
         */
        this.specId = specId;
        this.Species = Species;
        this._class = _class;
        this._feedType = _feedType;
        this.quantity = quantity;
        this.Descriptor = Descriptor;
        this.LocationID = LocationID;
    }

    /*
    GETTERS AND SETTERS for Species Info Table
     */
    public int getSpecId(int specId){
        return specId;
    }
    public void setSpecId(){
        this.specId = specId;
    }

    public String getSpecies() {
        return Species;
    }
   public void setSpecies(String species) {
       this.Species = species;
   }

    public Class get_class() {
        return _class;
    }

    public void set_class(Class _class) {
        this._class = _class;
    }

    public FeedingType get_feedType() {
        return _feedType;
    }

    public void set_feedType(FeedingType _feedType) {
        this._feedType = _feedType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptor() {
        return Descriptor;
    }

    public void setDescriptor(String Descriptor) {
        this.Descriptor = Descriptor;
    }

    public int getLocationID() {
        return LocationID;
    }

    public void setLocationID(int locationID) {
        LocationID = locationID;
    }
}
