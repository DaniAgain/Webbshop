package com.example.webbshop.repos;

import com.example.webbshop.models.OrderTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderTestRepo extends JpaRepository<OrderTest, Long> {

    List<OrderTest> findByCustomerId(Long customerId);

}
