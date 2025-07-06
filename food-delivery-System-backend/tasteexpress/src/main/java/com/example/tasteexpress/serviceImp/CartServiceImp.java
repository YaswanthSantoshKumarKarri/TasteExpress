package com.example.tasteexpress.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tasteexpress.DTO.CartDTO;
import com.example.tasteexpress.entity.Cart;
import com.example.tasteexpress.entity.FoodMenu;
import com.example.tasteexpress.repos.CartRepos;
import com.example.tasteexpress.repos.FoodMenuRepo;
import com.example.tasteexpress.service.CartService;

@Service
public class CartServiceImp implements CartService {

    @Autowired
    private CartRepos cartRepos;

    @Autowired
    private FoodMenuRepo foodMenuRepo;

    @Override
    public List<CartDTO> findAllCartItemsDTO() {
        List<Cart> carts = cartRepos.findAll();
        List<CartDTO> dtoList = new ArrayList<>();

        for (Cart cart : carts) {
            CartDTO dto = new CartDTO();
            dto.setCartId(cart.getCartId());
            dto.setQuantity(cart.getQuantity());
            dto.setDeliveryCharges(cart.getDeliveryCharges());
            dto.setDiscount(cart.getDiscount());

            FoodMenu food = cart.getFoodMenu();
            if (food != null) {
                dto.setFoodMenu(food); // Include entire FoodMenu object
            }

            dtoList.add(dto);
        }

        return dtoList;
    }

    @Override
    public Cart findCartById(int cartId) {
        Optional<Cart> cartOpt = cartRepos.findById(cartId);
        return cartOpt.orElseThrow(() -> new RuntimeException("Cart item not found with id: " + cartId));
    }

    @Override
    public Cart createCartItem(Cart cart) {
        return cartRepos.save(cart);
    }

    @Override
    public Cart updateCartItem(int cartId, Cart cartDetails) {
        Cart existingCart = findCartById(cartId);
        existingCart.setFoodMenu(cartDetails.getFoodMenu());
        existingCart.setQuantity(cartDetails.getQuantity());
        existingCart.setDeliveryCharges(cartDetails.getDeliveryCharges());
        existingCart.setDiscount(cartDetails.getDiscount());
        return cartRepos.save(existingCart);
    }

    @Override
    public void deleteCartItem(int cartId) {
        Cart existingCart = findCartById(cartId);
        cartRepos.delete(existingCart);
    }
}
