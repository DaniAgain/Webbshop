package com.example.webbshop.controllers;


import com.example.webbshop.models.Item;
import com.example.webbshop.repos.CustomerRepo;
import com.example.webbshop.repos.ItemRepo;
import com.example.webbshop.repos.OrderTestRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {


    private final CustomerRepo customerRepo;

    private final ItemRepo itemRepo;

    private final OrderTestRepo orderTestRepo;



    ItemController(CustomerRepo customerRepo, ItemRepo itemRepo, OrderTestRepo orderTestRepo){
        this.customerRepo = customerRepo;
        this.itemRepo = itemRepo;
        this.orderTestRepo = orderTestRepo;
    }


    @RequestMapping("items")
    public List<Item> getAllItems(){
        return itemRepo.findAll();
    }

    @RequestMapping("items/{id}")
    public Item findItemById(@PathVariable Long id){
        return itemRepo.findById(id).get();
    }


    @PostMapping("items/add")
    public String addItem(@RequestBody Item i) {
        itemRepo.save(i);
        if(i != null){
            return "Item was added";
        }
        else {
            return "Item was not addded";
        }
    }
    //curl http://localhost:8080/items/add -H "Content-Type:application/json" -d "{\"name\":\"Pants\", \"price\":\"500\"}" -v






}
