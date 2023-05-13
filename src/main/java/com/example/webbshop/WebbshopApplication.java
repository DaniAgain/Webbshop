package com.example.webbshop;

import com.example.webbshop.models.Customer;
import com.example.webbshop.models.Item;
import com.example.webbshop.models.OrderTest;
import com.example.webbshop.repos.CustomerRepo;
import com.example.webbshop.repos.ItemRepo;
import com.example.webbshop.repos.OrderTestRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebbshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebbshopApplication.class, args);
    }


    @Bean
    public CommandLineRunner bean(CustomerRepo customerRepo, ItemRepo itemRepo, OrderTestRepo orderTestRepo){
        return args -> {

            Customer customer1 = new Customer("Mimmi", "1993-01-03");
            Customer customer2 = new Customer("Jonas", "1955-05-02");
            Customer customer3 = new Customer("Henke", "1988-02-23");

            customerRepo.save(customer1);
            customerRepo.save(customer2);
            customerRepo.save(customer3);


            Item item1 = new Item("Shoes", 500);
            Item item2 = new Item("Hat", 200);
            Item item3 = new Item("T-Shirt", 300);

            itemRepo.save(item1);
            itemRepo.save(item2);
            itemRepo.save(item3);


            OrderTest order1 = new OrderTest("2021-01-01");
            OrderTest order2 = new OrderTest("2022-01-01");
            OrderTest order3 = new OrderTest("2023-01-01");

            orderTestRepo.save(order1);
            orderTestRepo.save(order2);
            orderTestRepo.save(order3);


        };

    }


}
