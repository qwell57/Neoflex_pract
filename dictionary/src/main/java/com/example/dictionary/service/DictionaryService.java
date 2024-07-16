package com.example.dictionary.service;

import com.example.dictionary.repository.DictionaryRepository;
import lombok.AllArgsConstructor;
import com.example.dictionary.model.Dictionary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DictionaryService {
    private final DictionaryRepository dictionaryRepository;

    public Dictionary save(Dictionary dictionary) {
        return dictionaryRepository.save(dictionary);
    }

    public List<Dictionary> findAll() {
        return dictionaryRepository.findAll();
    }


}
