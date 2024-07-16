package com.example.dictionary_2.controller;

import com.example.dictionary_2.model.Entity.DataEntity;
import com.example.dictionary_2.model.Entity.DictionaryEntity;
import com.example.dictionary_2.service.DataService;
import com.example.dictionary_2.service.DictionaryService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
//@AllArgsConstructor
@RequestMapping("/dictionaries/records")
public class DataController {
    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


    @PostMapping
    public DataEntity createDictionaryData(@RequestBody DataEntity Data) {
        return dataService.createData(Data);
    }

    @Operation(summary = "Получение записей справочника", description = "Возвращает список записей для указанного справочника")

    @GetMapping
    public List<DataEntity> getDictionaryData() {
        return dataService.getData();
    }
}
