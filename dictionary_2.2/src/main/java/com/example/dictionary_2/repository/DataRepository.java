package com.example.dictionary_2.repository;

import com.example.dictionary_2.model.Entity.DataEntity;
import com.example.dictionary_2.model.Entity.DictionaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;

public interface DataRepository extends JpaRepository<DataEntity, UUID> {
    List<DataEntity> findByDictionary(DictionaryEntity dictionary);
}