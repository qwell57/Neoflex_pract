package com.example.dictionary_2.model.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "data")
public class DataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "dictionary_id", nullable = false)
    private DictionaryEntity dictionary;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String value;
}
