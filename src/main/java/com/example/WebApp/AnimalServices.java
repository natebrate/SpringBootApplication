package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
SERVICES FOR THE ANIMAL TABLE
 */
@Service
@Transactional
public class AnimalServices {

    /*
    ANIMAL SECTION
     */
    @Autowired
    AnimalRepository animalRepository;

    public List<animalInfo> listAll(){
        return animalRepository.findAll();
    }

    //Save the Animal Member
    public void save(animalInfo info) {
        animalRepository.save(info);
    }

    //Get the Animal ID
   public animalInfo get(int animalID) {
        return animalRepository.findById(animalID);
   }

    // DELETE THE STAFF MEMBER
    public void delete(int animalID) {
        animalRepository.deleteById(animalID);
    }
}
