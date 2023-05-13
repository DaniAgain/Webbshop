package com.example.webbshop.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }



}
