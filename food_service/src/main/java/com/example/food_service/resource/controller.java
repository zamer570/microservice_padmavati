package com.example.food_service.resource;

import com.example.food_service.entity.Cafe;
import com.example.food_service.entity.Food;
import com.example.food_service.model.User;
import com.example.food_service.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
public class controller {

    @Autowired
    private FoodService foodService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("get-cafes")
    public ResponseEntity<List<Cafe>> getCafe(@RequestParam int id){
        //check if the user is valid or not
        //get data from user service based on id
        //access proceed else no
        ResponseEntity<User> user;
        try {
            user = restTemplate.getForEntity("http://USER_SERVICE/users/get-user/" + id, User.class);
        }
        catch (HttpClientErrorException exception){
            return ResponseEntity.status(exception.getStatusCode()).body(List.of());
        }
        List<Cafe> cafes = foodService.getCafes();
        return ResponseEntity.ok(cafes);
    }

    @GetMapping("get-menu/{cId}")
    public ResponseEntity<List<Food>> getMenu(@PathVariable(value = "cId") int cafeId){
        List<Food> menu = foodService.getMenu(cafeId);
        return ResponseEntity.ok(menu);
    }

    @PostMapping("add-cafe")
    public ResponseEntity<Cafe> addCafe(@RequestBody Cafe cafe){
        foodService.addCafe(cafe);
        return ResponseEntity.ok(cafe);
    }

    @PostMapping("add-menu/{cId}")
    public ResponseEntity<List<Food>> addFood(@RequestBody List<Food> foods,@PathVariable int cId){
        foods.forEach(val -> val.setCId(cId));
        foodService.addFoods(foods);
        return ResponseEntity.ok(foods);
    }


}
