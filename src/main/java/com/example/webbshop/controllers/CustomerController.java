package com.example.webbshop.controllers;


import com.example.webbshop.models.Customer;
import com.example.webbshop.models.OrderTest;
import com.example.webbshop.repos.CustomerRepo;
import com.example.webbshop.repos.ItemRepo;
import com.example.webbshop.repos.OrderTestRepo;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    private final CustomerRepo customerRepo;

    private final ItemRepo itemRepo;

    private final OrderTestRepo orderTestRepo;




    CustomerController(CustomerRepo customerRepo, ItemRepo itemRepo, OrderTestRepo orderTestRepo){
        this.customerRepo = customerRepo;
        this.itemRepo = itemRepo;
        this.orderTestRepo = orderTestRepo;
    }

    @RequestMapping("customers")
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    @RequestMapping("customers/{id}")
    public Customer findCustomerById(@PathVariable Long id){
        return customerRepo.findById(id).get();
    }


    @PostMapping("customers/add")
    public String addCustomer(@RequestBody Customer c) {
        customerRepo.save(c);
        if(c != null){
            return "Customer was added";
        }
        else {
            return "Customer was not addded";
        }

    }
    //curl http://localhost:8080/customers/add -H "Content-Type:application/json" -d "{\"name\":\"Linus\", \"ssn\":\"2002-01-20\"}" -v







}
