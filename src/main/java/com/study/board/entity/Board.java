package com.study.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType. )
    private Integer id;

    private String title;

    private String content;
}
