package com.tugas4.pitri.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tugas4.pitri.models.Chef;

@Service
public class ChefService {
    public List<Chef> getAllChef() {
        List<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(1, "hilwa", "semarang"));
        chefs.add(new Chef(2, "riri", "banjar"));
        chefs.add(new Chef(3, "tisa", "banjar"));
        chefs.add(new Chef(4, "pitri", "KBB"));
        return chefs;
    }
}
