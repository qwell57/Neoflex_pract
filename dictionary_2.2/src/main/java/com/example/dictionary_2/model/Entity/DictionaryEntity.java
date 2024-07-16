package com.example.dictionary_2.model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@Entity
@Table(name = "dictionary")
public class DictionaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String description;

}
