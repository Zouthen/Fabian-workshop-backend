package com.example.fabianworkshopbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public String name;
    public String email;
    public String woodType;
    public String priceEstimate;
    public String metalType;
    public String engravingText;

    public Order(String name, String email, String woodType, String priceEstimate, String metalType, String engravingText) {
        this.name = name;
        this.email = email;
        this.woodType = woodType;
        this.priceEstimate = priceEstimate;
        this.metalType = metalType;
        this.engravingText = engravingText;
    }

    public Order() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public String getPriceEstimate() {
        return priceEstimate;
    }

    public void setPriceEstimate(String priceEstimate) {
        this.priceEstimate = priceEstimate;
    }

    public String getMetalType() {
        return metalType;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType;
    }

    public String getEngravingText() {
        return engravingText;
    }

    public void setEngravingText(String engravingText) {
        this.engravingText = engravingText;
    }
}

