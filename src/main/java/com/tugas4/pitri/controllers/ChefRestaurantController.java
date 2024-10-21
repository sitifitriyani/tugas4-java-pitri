package com.tugas4.pitri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.pitri.services.ChefRestaurantService;

@Controller
public class ChefRestaurantController {
    @Autowired
    private ChefRestaurantService chefRestaurantService;

    @GetMapping("/chef-restaurant")
    public String listChefRestaurant(Model model) {
        model.addAttribute("chefRestaurants", chefRestaurantService.getChefRestaurant());
        return "chef-restaurant";
    }
}
