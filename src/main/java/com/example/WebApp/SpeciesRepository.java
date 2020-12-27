package com.example.WebApp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<SpeciesInfo, Integer> {

    SpeciesInfo findById(int SpecId);

    void deleteById(int SpecId);
}

