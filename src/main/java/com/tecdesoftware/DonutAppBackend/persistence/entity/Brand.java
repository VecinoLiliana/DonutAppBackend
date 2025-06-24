package com.tecdesoftware.DonutAppBackend.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Integer brandId;

    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Donut> donuts;

    @OneToMany(mappedBy = "brand")
    private List<Burger> burgers;

    @OneToMany(mappedBy = "brand")
    private List<Smoothie> smoothies;

    @OneToMany(mappedBy = "brand")
    private List<Pancake> pancakes;

    @OneToMany(mappedBy = "brand")
    private List<Pizza> pizzas;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Donut> getDonuts() {
        return donuts;
    }

    public void setDonuts(List<Donut> donuts) {
        this.donuts = donuts;
    }

    public List<Burger> getBurgers() {
        return burgers;
    }

    public void setBurgers(List<Burger> burgers) {
        this.burgers = burgers;
    }

    public List<Smoothie> getSmoothies() {
        return smoothies;
    }

    public void setSmoothies(List<Smoothie> smoothies) {
        this.smoothies = smoothies;
    }

    public List<Pancake> getPancakes() {
        return pancakes;
    }

    public void setPancakes(List<Pancake> pancakes) {
        this.pancakes = pancakes;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
