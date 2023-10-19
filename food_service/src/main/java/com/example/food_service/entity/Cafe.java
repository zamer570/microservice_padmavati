package com.example.food_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cafe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private String cId;

    @Column(name = "name")
    private String name;
}
