package com.example.demo.repository;

import com.example.demo.entities.EcdictWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//No delete or update or add
@Repository
public interface EcdictRepository extends JpaRepository<EcdictWord,String> {
    EcdictWord findByWord(String word);
    boolean existsByWordIgnoreCase(String word);
    EcdictWord findByWordIgnoreCase(String word);
    List<EcdictWord> getAllByOrderByFrq();
}
