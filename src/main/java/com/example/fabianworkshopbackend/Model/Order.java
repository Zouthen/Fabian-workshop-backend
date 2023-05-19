package com.example.fabianworkshopbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Order {


    public String name;
    public String email;
    public String woodType;
    public String LeatherType;
    public String Inlay;
    public String priceEstimate;

    public Order(String name, String email, String woodType, String LeatherType, String Inlay, String priceEstimate) {
        this.name = name;
        this.email = email;
        this.woodType = woodType;
        this.LeatherType = LeatherType;
        this.Inlay = Inlay;
        this.priceEstimate = priceEstimate;
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


    public String getLeatherType() {
        return LeatherType;
    }

    public void setLeatherType(String metalType) {
        this.LeatherType = metalType;
    }

    public String getInlay() {
        return Inlay;
    }

    public void setInlay(String engravingText) {
        this.Inlay = engravingText;
    }

    public String getPriceEstimate() {
        return priceEstimate;
    }

    public void setPriceEstimate(String priceEstimate) {
        this.priceEstimate = priceEstimate;
    }

}

