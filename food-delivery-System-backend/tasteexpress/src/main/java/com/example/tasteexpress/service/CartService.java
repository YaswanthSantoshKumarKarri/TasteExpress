package com.example.tasteexpress.service;

import java.util.List;
import com.example.tasteexpress.DTO.CartDTO;
import com.example.tasteexpress.entity.Cart;

public interface CartService {
    List<CartDTO> findAllCartItemsDTO();
    Cart findCartById(int cartId);
    Cart createCartItem(Cart cart);
    Cart updateCartItem(int cartId, Cart cartDetails);
    void deleteCartItem(int cartId);
}
