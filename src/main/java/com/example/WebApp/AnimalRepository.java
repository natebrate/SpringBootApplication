package com.example.WebApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<animalInfo, Integer> {

    animalInfo findById(int animalID);

    void deleteById(int animalID);
}
