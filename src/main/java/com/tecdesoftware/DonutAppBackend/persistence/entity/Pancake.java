package com.tecdesoftware.DonutAppBackend.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pancakes")
public class Pancake {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pancake_id")
    private Integer pancakeId;

    private String name;

    private Double price;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "brand_id", insertable = false, updatable = false)
    private Brand brand;

    @Column(name = "brand_id")
    private Integer brandId;

    public Integer getPancakeId() {
        return pancakeId;
    }

    public void setPancakeId(Integer pancakeId) {
        this.pancakeId = pancakeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}
