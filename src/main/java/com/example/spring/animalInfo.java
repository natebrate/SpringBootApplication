/*
class for the animal table
 */
package com.example.spring;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class animalInfo {

    // initializing the variables
    @Id
    private int animalID;
    private String name;
    private int trainerID;
    private int speciesID;
    private int age;
    private enum sex {
        Male,
        Female
        //sex is given 2 options
    }
    private float weight;

    sex _val;

    public animalInfo() {
        /*empty constructor*/
    }

    //COmstructor for animal
    public animalInfo(int animalID, String name, int trainerID, int speciesID, int age, sex val, float weight)
    {
        this.animalID = animalID;
        this.name = name;
        this.trainerID = trainerID;
        this.speciesID = speciesID;
        this.age = age;
        this._val = val;
        this.weight = weight;
    }

    /*
    Getters and Setters
     */
    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public sex get_val() {
        return _val;
    }

    public void set_val(sex _val) {
        this._val = _val;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "\n\tID: " + animalID +
                "\n\tName: " + name +
                "\n\tQuantity: " + trainerID +
                "\n\tQuantity: " + speciesID +
                "\n\tQuantity: " + age +
                "\n\tQuantity: " + _val +
                "\n\tPrice: " + weight;
    }

}
