package com.example.firstproject.entity;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String title;
    @Column
    private String content;
}
