package com.example.WebApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

    Staff findById(int StaffID);

    void deleteById(int StaffID);
}
