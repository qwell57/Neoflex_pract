package com.example.dictionary_2.controller;

import com.example.dictionary_2.model.Entity.DataEntity;
import com.example.dictionary_2.model.Entity.DictionaryEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dictionary_2.service.DictionaryService;

import java.util.List;
import java.util.UUID;

@RestController
//@AllArgsConstructor
@RequestMapping("/dictionaries")
@Tag(name = "Dictionary Controller", description = "Управление справочниками")
public class DictionaryController {

    private final DictionaryService dictionaryService;

    public DictionaryController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @Operation(summary = "Создание справочника", description = "Создает новый справочник")

    @PostMapping
    public String createDictionary(@RequestBody DictionaryEntity dictionary) {
        dictionaryService.createDictionary(dictionary);
        return "Student successfully saved";
    }

    @Operation(summary = "Получение списка справочников", description = "Возвращает список всех существующих справочников")

    @GetMapping
    public List<DictionaryEntity> getAllDictionaries() {
        return dictionaryService.getAllDictionaries();
    }


}