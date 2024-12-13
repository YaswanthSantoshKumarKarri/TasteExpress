package com.example.tasteexpress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	@ManyToOne(fetch = FetchType.LAZY) // Lazy fetching is usually recommended for ManyToOne relationships
    @JoinColumn(name = "foodId", referencedColumnName = "itemId")
    private FoodMenu foodMenu;
	private int quantity;
	private float deliveryCharges;
	private float discount;
}
