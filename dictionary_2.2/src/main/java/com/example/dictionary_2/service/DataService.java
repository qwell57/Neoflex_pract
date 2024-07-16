package com.example.dictionary_2.service;

import com.example.dictionary_2.repository.DataRepository;
import lombok.AllArgsConstructor;
import com.example.dictionary_2.model.Entity.DataEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.List;

@Service
@AllArgsConstructor
public class DataService {
    private final DataRepository dataRepository;

    public DataEntity createData(DataEntity dictionaryData) {
        return dataRepository.save(dictionaryData);
    }


    public List<DataEntity> getData() {
        return dataRepository.findAll();
    }
}
