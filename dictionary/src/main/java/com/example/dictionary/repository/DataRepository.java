package com.example.dictionary.repository;

import com.example.dictionary.model.Data;
import com.example.dictionary.model.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;

public interface DataRepository extends JpaRepository<Data, UUID> {
    List<Data> findAllByDictionary(Dictionary dictionary);
}