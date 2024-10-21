package com.tugas4.pitri.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tugas4.pitri.models.Food;

@Service
public class FoodService {
    public List<Food> getAllFood() {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food(1, "chicken steak", 23000L, "sedang"));
        foods.add(new Food(2, "kentang goreng", 19000L, "besar"));
        foods.add(new Food(3, "ayam geprek", 25000L, "kecil"));
        foods.add(new Food(4, "nasi goreng", 24000L, "sedang"));
        return foods;
    }
}
