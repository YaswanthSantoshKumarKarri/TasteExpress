package com.example.tasteexpress.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="food_menu")
public class FoodMenu {
	
	@Id
	private int dishId;
	private String cuisine;
	private String dishName;
	private String ingredients;
	private int foodItemCost;
	private String imgUrl;
	private String cal;
	private float rating;
	private String foodType;

}
