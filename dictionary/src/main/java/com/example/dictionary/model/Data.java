package com.example.dictionary.model;

import jakarta.persistence.*;
import java.util.UUID;

@lombok.Data
@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "dictionary_id", nullable = false)
    private Dictionary dictionary;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String value;
}
