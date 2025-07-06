package com.example.tasteexpress.DTO;

import com.example.tasteexpress.entity.FoodMenu;
import lombok.Data;

@Data
public class CartDTO {
    private int cartId;
    private int quantity;
    private float deliveryCharges;
    private float discount;
    private FoodMenu foodMenu; // Full foodMenu object
}
