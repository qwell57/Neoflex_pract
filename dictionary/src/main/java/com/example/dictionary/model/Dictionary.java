package com.example.dictionary.model;

import jakarta.persistence.*;

import java.util.UUID;

@lombok.Data
@Entity
@Table(name = "dictionary")
public class Dictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String description;

}
