package com.example.tasteexpress.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tasteexpress.entity.FoodMenu;

@Service
public interface FoodMenuService {

	List<FoodMenu> getAllItems();

	String createItem(FoodMenu foodMenuData);

}
