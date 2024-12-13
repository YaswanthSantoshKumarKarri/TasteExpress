package com.example.tasteexpress.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasteexpress.entity.Client;
import com.example.tasteexpress.service.ClientService;

@RestController
@RequestMapping("/API/client/")
@CrossOrigin("http://localhost:3030")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping("create")
	public String createClient(@RequestBody Client clientData) {
		return clientService.createClient(clientData);
	}
	
	@GetMapping("getCredentials/{Id}/{password}")
	public Optional<Client> getByIdPass(@PathVariable String Id,@PathVariable String password) {
		return clientService.getByIdPass(Id,password);
	}
}
