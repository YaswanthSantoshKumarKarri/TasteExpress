package com.example.tasteexpress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.tasteexpress.DTO.CartDTO;
import com.example.tasteexpress.entity.Cart;
import com.example.tasteexpress.service.CartService;

@RestController
@RequestMapping("/API/Cart/")
@CrossOrigin(origins = "http://localhost:3030")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("getAllCartItems")
    public List<CartDTO> getAllCartItems() {
        return cartService.findAllCartItemsDTO();
    }

    @PostMapping("createCartItem")
    public Cart createCartItem(@RequestBody Cart cart) {
        return cartService.createCartItem(cart);
    }

    @PutMapping("update/{id}")
    public Cart updateCartItem(@PathVariable("id") int id, @RequestBody Cart cart) {
        return cartService.updateCartItem(id, cart);
    }

    @DeleteMapping("delete/{id}")
    public String deleteCartItem(@PathVariable("id") int id) {
        cartService.deleteCartItem(id);
        return "Cart item deleted successfully with id: " + id;
    }
}
