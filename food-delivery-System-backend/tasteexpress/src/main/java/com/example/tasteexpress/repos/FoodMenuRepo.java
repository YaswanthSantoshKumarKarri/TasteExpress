package com.example.tasteexpress.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tasteexpress.entity.FoodMenu;

public interface FoodMenuRepo extends JpaRepository<FoodMenu, Integer> {

}
