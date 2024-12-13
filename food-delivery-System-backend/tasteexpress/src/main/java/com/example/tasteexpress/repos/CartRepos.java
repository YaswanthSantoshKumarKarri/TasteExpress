package com.example.tasteexpress.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tasteexpress.entity.Cart;

public interface CartRepos extends JpaRepository<Cart, Integer> {

}
