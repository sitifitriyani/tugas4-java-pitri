package com.tugas4.pitri.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tugas4.pitri.services.ChefService;

@Controller
public class ChefController {
    @Autowired
    private ChefService chefService;

    @GetMapping("/chef")
    public String listChef(Model model) {
        model.addAttribute("chefs", chefService.getAllChef());
        return "chef";
    }
}
