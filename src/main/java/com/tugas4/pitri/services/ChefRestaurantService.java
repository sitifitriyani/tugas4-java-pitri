package com.tugas4.pitri.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tugas4.pitri.models.ChefRestaurant;
import com.tugas4.pitri.models.Food;
import com.tugas4.pitri.models.Chef;

@Service  // Tambahkan anotasi ini
public class ChefRestaurantService {
    @Autowired
    private FoodService foodService;
    
    @Autowired
    private ChefService chefService;

    public List<ChefRestaurant> getChefRestaurant() {
        List<ChefRestaurant> chefRestaurants = new ArrayList<>();
        List<Food> foods = foodService.getAllFood();
        List<Chef> chefs = chefService.getAllChef();

        for (int i = 0; i < foods.size(); i++) {
            Food food = foods.get(i);
            Chef chef = chefs.get(i % chefs.size());
            chefRestaurants.add(new ChefRestaurant(food, chef));
        }
        return chefRestaurants;
    }
}
