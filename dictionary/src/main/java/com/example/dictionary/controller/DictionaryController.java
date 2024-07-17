package com.example.dictionary.controller;

import com.example.dictionary.model.Dictionary;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.dictionary.service.DictionaryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dictionaries")
@Tag(name = "Dictionary Controller", description = "Управление справочниками")
public class DictionaryController {
    private final DictionaryService dictionaryService;

    @Operation(summary = "Создание справочника", description = "Создает новый справочник")
    @PostMapping
    public String createDictionary(@RequestBody Dictionary dictionary) {
        dictionaryService.save(dictionary);
        return "Student successfully saved";
    }

    @Operation(summary = "Получение списка справочников", description = "Возвращает список всех существующих справочников")
    @GetMapping
    public List<Dictionary> getAllDictionaries() {
        return dictionaryService.findAll();
    }
}
