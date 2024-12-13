package com.example.tasteexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasteexpress.service.CartService;

@RestController
@RequestMapping("/API/Cart/")
@CrossOrigin("http://localhost:3030")
public class CartController {
	@Autowired
	private CartService cartService;
	
		
}
