package com.example.dictionary.controller;

import com.example.dictionary.model.Data;
import com.example.dictionary.service.DataService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dictionaries/records")
public class DataController {
    private final DataService dataService;

    @Operation(summary = "Создание записи в справочнике", description = "Добавляет новую запись в существующий справочник")
    @PostMapping
    public Data saveData(@RequestBody Data Data) {
        return dataService.saveData(Data);
    }

    @Operation(summary = "Получение записей справочника по id", description = "Возвращает список записей для справочника")
    @GetMapping("/{id}")
    public List<Data> findDataById(@PathVariable UUID id) {
        return dataService.findDataById(id);
    }

    @Operation(summary = "Получение записей справочника", description = "Возвращает список записей для всех справочников")
    @GetMapping
    public List<Data> findAllData() {
        return dataService.findAll();
    }
}
