package com.example.food_service.repository;

import com.example.food_service.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food,String> {

    public List<Food> findBycId(String cafeId);

    public List<Food> findByName(String name);
}
