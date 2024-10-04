package com.example.laptop_Recommendation.service;

import com.example.laptop_Recommendation.model.Laptop;
import com.example.laptop_Recommendation.repo.LaptopRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Laptop> recommendLaptops(double budget) {

        return jpaStreamer.stream(Laptop.class)
                .filter(laptop -> laptop.getPrice() <= budget)
                .collect(Collectors.toList());
    }

    // Recommend laptops by budget, RAM, and storage
    public List<Laptop> recommendLaptops(double budget, String ram, String storage) {
        List<Laptop> laptops = jpaStreamer.stream(Laptop.class)
                .filter(laptop -> laptop.getPrice() <= budget)
                .filter(laptop -> laptop.getRam().equalsIgnoreCase(ram))
                .filter(laptop -> laptop.getStorage().equalsIgnoreCase(storage))
                .collect(Collectors.toList());


        if (laptops.isEmpty()) {
            System.out.println("No laptops found matching the given criteria.");
        }

        return laptops;
    }

    // Filter laptops only by storage
    public List<Laptop> findLaptopsByStorage(String storage) {
        return jpaStreamer.stream(Laptop.class)
                .filter(laptop -> laptop.getStorage().equalsIgnoreCase(storage))
                .collect(Collectors.toList());
    }
}
