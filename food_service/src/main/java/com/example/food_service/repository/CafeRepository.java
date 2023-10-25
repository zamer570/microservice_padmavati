package com.example.food_service.repository;

import com.example.food_service.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CafeRepository extends JpaRepository<Cafe,Integer> {

}
