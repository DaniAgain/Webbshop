package com.example.webbshop.repos;

import com.example.webbshop.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Long> {


}
