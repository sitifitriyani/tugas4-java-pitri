package com.tugas4.pitri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.pitri.services.FoodService;
import com.tugas4.pitri.models.Food;
import java.util.*;

@Controller
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/food")
    public String listFood(Model model) {
        List <Food> food = foodService.getAllFood();
        model.addAttribute("foods", food);
        return "food";
    }
}
