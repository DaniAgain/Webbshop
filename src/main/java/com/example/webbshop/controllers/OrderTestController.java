package com.example.webbshop.controllers;


import com.example.webbshop.models.Customer;
import com.example.webbshop.models.Item;
import com.example.webbshop.models.OrderTest;
import com.example.webbshop.repos.CustomerRepo;
import com.example.webbshop.repos.ItemRepo;
import com.example.webbshop.repos.OrderTestRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OrderTestController {


    private final CustomerRepo customerRepo;

    private final ItemRepo itemRepo;

    private final OrderTestRepo orderTestRepo;



    OrderTestController(CustomerRepo customerRepo, ItemRepo itemRepo, OrderTestRepo orderTestRepo){
        this.customerRepo = customerRepo;
        this.itemRepo = itemRepo;
        this.orderTestRepo = orderTestRepo;

    }


    @RequestMapping("ordersTest")
    public List<OrderTest> getAllOrdersTests(){
        return orderTestRepo.findAll();
    }


    @GetMapping("ordersTest/{customerId}")
    public List<OrderTest> getOrdersByCustomerId(@PathVariable Long customerId){
        return orderTestRepo.findByCustomerId(customerId);

    }


    @RequestMapping("ordersTest/add")
    public String addOrder(@RequestParam String date, @RequestParam Customer customerId, @RequestParam Item itemId){
        Item i = itemRepo.findById(itemId.getId()).get();
        Customer c = customerRepo.findById(customerId.getId()).get();
        if(i != null && c != null){
            orderTestRepo.save(new OrderTest(date, customerId, itemId));
            return "Order has been added successfully";
        }
        return "Invalid";
    }


}
