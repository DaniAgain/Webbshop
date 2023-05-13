package com.example.webbshop.repos;

import com.example.webbshop.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Customer, Long> {



}
