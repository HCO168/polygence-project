package com.example.demo.repository;

import  com.example.demo.entities.FamiliarityData;
import com.example.demo.entities.FamiliarityKey;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
@Repository
public interface FamiliarityRepository extends JpaRepository<FamiliarityData, FamiliarityKey> {
    FamiliarityData getFamiliarityDataByUsernameAndWord(String username, String word);
    List<FamiliarityData> getFamiliarityDataByUsername(String username);

    @Modifying
    @Transactional
    @Query("UPDATE FamiliarityData w SET w.familiarity = :familiarity, w.last_quizzed = :last_quizzed " +
            "WHERE w.username = :username AND w.word = :word")
    void updateFamiliarityAndLast_quizzedByUsernameAndWord(String username, String word, Integer familiarity, Instant last_quizzed);

}
