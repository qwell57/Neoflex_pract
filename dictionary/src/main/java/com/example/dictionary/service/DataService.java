package com.example.dictionary.service;

import com.example.dictionary.model.Dictionary;
import com.example.dictionary.repository.DataRepository;
import com.example.dictionary.repository.DictionaryRepository;
import lombok.AllArgsConstructor;
import com.example.dictionary.model.Data;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.List;

@Service
@AllArgsConstructor
public class DataService {
    private final DataRepository dataRepository;

    private final DictionaryRepository dictionaryRepository;

    public Data saveData(Data data) {
        return dataRepository.save(data);
    }

    public List<Data> findDataById(UUID id) {
        Dictionary dictionary = dictionaryRepository.findById(id).orElse(null);
        return dataRepository.findAllByDictionary(dictionary);
    }

    public List<Data> findAll() {
        return dataRepository.findAll();
    }
}
