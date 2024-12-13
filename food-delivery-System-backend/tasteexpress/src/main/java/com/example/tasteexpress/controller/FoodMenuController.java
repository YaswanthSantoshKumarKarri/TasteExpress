package com.example.tasteexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasteexpress.entity.FoodMenu;
import com.example.tasteexpress.service.FoodMenuService;

@RestController
@RequestMapping("/API/FoodMenu/")
@CrossOrigin("http://localhost:3030")
public class FoodMenuController {

	@Autowired
	private FoodMenuService foodMenuServic;
	
	@PostMapping("create")
	public String createItem(@RequestBody FoodMenu foodMenuData){
		return foodMenuServic.createItem(foodMenuData);
	}
	
	@GetMapping("All")
	public List<FoodMenu> getAllItems(){
		return foodMenuServic.getAllItems();
	}
}
