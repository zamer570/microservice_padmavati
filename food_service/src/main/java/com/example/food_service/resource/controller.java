package com.example.food_service.resource;

import com.example.food_service.entity.Cafe;
import com.example.food_service.entity.Food;
import com.example.food_service.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private FoodService foodService;

    @GetMapping("get-cafes")
    public ResponseEntity<List<Cafe>> getCafe(){
        List<Cafe> cafes = foodService.getCafes();
        return ResponseEntity.ok(cafes);
    }

    @GetMapping("get-menu/{cId}")
    public ResponseEntity<List<Food>> getMenu(@PathVariable(value = "cId") String cafeId){
        List<Food> menu = foodService.getMenu(cafeId);
        return ResponseEntity.ok(menu);
    }


}
