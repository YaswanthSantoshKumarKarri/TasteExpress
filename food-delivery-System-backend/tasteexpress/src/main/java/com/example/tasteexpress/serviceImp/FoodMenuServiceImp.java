package com.example.tasteexpress.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tasteexpress.entity.FoodMenu;
import com.example.tasteexpress.repos.FoodMenuRepo;
import com.example.tasteexpress.service.FoodMenuService;

@Service
public class FoodMenuServiceImp implements FoodMenuService {

	@Autowired
	private FoodMenuRepo foodMenuRepo;
	
	@Override
	public String createItem(FoodMenu foodMenuData) {
		if(foodMenuRepo.save(foodMenuData) != null) {
			return "successfully created food item";
		}
		return "nope failed to create food item";
	}
	@Override
	public List<FoodMenu> getAllItems() {
		List<FoodMenu> all = foodMenuRepo.findAll();
	    System.out.println("Fetched items: " + all.size());
	    all.forEach(System.out::println);
	    return all;
	}
	

}
