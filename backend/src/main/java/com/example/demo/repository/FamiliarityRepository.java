package com.example.demo.repository;

import com.example.demo.entities.FamiliarityData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamiliarityRepository extends JpaRepository<FamiliarityData,Integer> {

}
