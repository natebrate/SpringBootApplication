package com.example.WebApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

    @Query("SELECT u FROM Staff u WHERE u.username = :username")
    Staff getUserByUsername(@Param("username") String username);
    Staff findByStaffID(int StaffID);
    Staff findByUsername(String username);

    void deleteById(int StaffID);
}
