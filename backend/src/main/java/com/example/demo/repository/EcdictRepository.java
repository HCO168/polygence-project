package com.example.demo.repository;

import com.example.demo.entities.EcdictWord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//No delete or update or add
public interface EcdictRepository extends JpaRepository<EcdictWord,String> {
    EcdictWord getEcdictWordByWord(String word);

}
