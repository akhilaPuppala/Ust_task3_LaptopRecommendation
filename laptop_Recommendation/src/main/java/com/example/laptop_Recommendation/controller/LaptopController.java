package com.example.laptop_Recommendation.controller;

import com.example.laptop_Recommendation.model.Laptop;
import com.example.laptop_Recommendation.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    // Endpoint to recommend laptops based on the user's budget
    @GetMapping("/recommend")
    public List<Laptop> recommendLaptops(@RequestParam double budget) {
        return laptopService.recommendLaptops(budget);
    }
    // Endpoint to recommend laptops based on budget, RAM, and storage
    @GetMapping("/recommend2")
    public List<Laptop> recommendLaptops(
            @RequestParam double budget,
            @RequestParam String ram,
            @RequestParam String storage) {
        return laptopService.recommendLaptops(budget, ram, storage);
    }
    // Endpoint to find laptops by storage
    @GetMapping("/storage")
    public List<Laptop> findLaptopsByStorage(@RequestParam String storage) {
        return laptopService.findLaptopsByStorage(storage);
    }


}
