package com.example.dictionary_2.repository;

import com.example.dictionary_2.model.Entity.DictionaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DictionaryRepository extends JpaRepository<DictionaryEntity, UUID> {
}