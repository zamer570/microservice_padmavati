package com.example.food_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="food")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int fId;


    @Column(name = "Cafe Id")
    private int cId;


    @Column(name="name",unique = true)
    private String name;

    @Column(name="price")
    private int price;

    @Column(name="ingredients")
    private String ingredients;

    @Column(name="state_speciality")
    private String state;

    @Column(name = "rating")
    private double rating;
}
