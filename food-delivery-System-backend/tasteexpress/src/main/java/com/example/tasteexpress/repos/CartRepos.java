package com.example.tasteexpress.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.tasteexpress.entity.Cart;

@Repository
public interface CartRepos extends JpaRepository<Cart, Integer> {
}
