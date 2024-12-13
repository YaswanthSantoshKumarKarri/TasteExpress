package com.example.tasteexpress.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.tasteexpress.entity.Client;

@Service
public interface ClientService {

	String createClient(Client clientData);

	Optional<Client> getByIdPass(String Id, String password);
}