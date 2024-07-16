package com.example.dictionary_2.service;

import com.example.dictionary_2.repository.DataRepository;
import com.example.dictionary_2.repository.DictionaryRepository;
import lombok.AllArgsConstructor;
import com.example.dictionary_2.model.Entity.DataEntity;
import com.example.dictionary_2.model.Entity.DictionaryEntity;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.List;

@Service
@AllArgsConstructor
public class DictionaryService {
    private final DictionaryRepository dictionaryRepository;


    public DictionaryEntity createDictionary(DictionaryEntity dictionary) {
        return dictionaryRepository.save(dictionary);
    }

//    public void deleteDictionary(UUID id) {
//        dictionaryRepository.deleteById(id);
//    }



    public List<DictionaryEntity> getAllDictionaries() {
        return dictionaryRepository.findAll();
    }


}
