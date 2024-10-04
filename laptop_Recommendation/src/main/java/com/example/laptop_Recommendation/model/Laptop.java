package com.example.laptop_Recommendation.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
public class Laptop {
    @Id
    @Column(name = "laptop_id")
    private Long id;

    @Column(name = "laptop_name")
    private String name;

    @Column(name = "laptop_brand")
    private String brand;

    @Column(name = "laptop_price")
    private double price;

    @Column(name = "processor")
    private String processor;

    @Column(name = "ram_size")
    private String ram;

    @Column(name = "storage_capacity")
    private String storage;
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}



