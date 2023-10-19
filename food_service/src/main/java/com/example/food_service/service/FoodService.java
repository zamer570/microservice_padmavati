package com.example.food_service.service;

import com.example.food_service.entity.Cafe;
import com.example.food_service.entity.Food;
import com.example.food_service.repository.CafeRepository;
import com.example.food_service.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private CafeRepository cafeRepository;
    public List<Cafe> getCafes(){
        return cafeRepository.findAll();
    }

    public List<Food> getMenu(String cafeId) {
        return foodRepository.findBycId(cafeId);
    }
}
