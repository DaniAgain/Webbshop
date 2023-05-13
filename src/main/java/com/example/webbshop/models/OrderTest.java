package com.example.webbshop.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class OrderTest {

    @Id
    @GeneratedValue
    private Long Id;

    private String date;

    @OneToOne
    @JoinColumn
    private Customer customer;

    @OneToOne
    @JoinColumn
    private Item item;



    public OrderTest(String date){
        this.date = date;
    }

    public OrderTest(String date, Customer customer, Item item){
        this.date = date;
        this.customer = customer;
        this.item = item;
    }


}
