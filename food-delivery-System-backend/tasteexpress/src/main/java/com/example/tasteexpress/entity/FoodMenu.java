package com.example.tasteexpress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="foodMenu")
public class FoodMenu {
	
	@Id
	private int itemId;
	private String quantity;
	private String itemName;
	private String itemType;
	private String itemDescription;
	private int itemCost;
	private String itemImg;
	private String itemMakingTime;

}
