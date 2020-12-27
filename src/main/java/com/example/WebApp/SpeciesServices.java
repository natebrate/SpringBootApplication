package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SpeciesServices {

    /*
    ANIMAL SECTION
     */
    @Autowired
    SpeciesRepository repo;

    public List<SpeciesInfo> listAll(){
        return repo.findAll();
    }

    //Save the Animal Member
    public void save(SpeciesInfo info) {
        repo.save(info);
    }

    //Get the Animal ID
    public SpeciesInfo get(int SpecId) {
        return repo.findById(SpecId);
    }

    // DELETE THE STAFF MEMBER
    public void delete(int SpecId) {
        repo.deleteById(SpecId);
    }
}
