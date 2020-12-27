package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/*
SERVICES FOR THE STAFF TABLE
 */
@Service
@Transactional
public class StaffServices {

    @Autowired
    private StaffRepository repo;


    //Retrieve All Elements From the Staff Table
    public  List<Staff> listAll(){
       return repo.findAll();
    }

    //Save the Staff Member
    public void save(Staff staff) {
        repo.save(staff);
    }

    //Get the Staff ID
    public Staff get(int StaffID) {
        return repo.findById(StaffID);
    }

    // DELETE THE STAFF MEMBER
    public void delete(int StaffID) {
        repo.deleteById(StaffID);
    }

}
