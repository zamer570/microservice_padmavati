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
    @Column(name = "Id")
    private int f_id;

    @Column(name="Cafe Id")
    private int c_id;

    @Column(name="Name")
    private String name;

    @Column(name="Price")
    private String price;

    @Column(name="Ingredients")
    private String ingredients;

    @Column(name="State Speciality")
    private String state;

    @Column(name = "Rating")
    private double rating;
}
