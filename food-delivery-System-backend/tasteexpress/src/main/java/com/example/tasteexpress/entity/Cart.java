package com.example.tasteexpress.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foodId", referencedColumnName = "DishId")
    private FoodMenu foodMenu;

    private int quantity;
    private float deliveryCharges;
    private float discount;
}
