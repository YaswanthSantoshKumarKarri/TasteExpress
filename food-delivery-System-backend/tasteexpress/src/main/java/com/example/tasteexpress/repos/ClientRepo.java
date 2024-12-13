package com.example.tasteexpress.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tasteexpress.entity.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client, String> {

	Client findByEmailId(String emailId);

	Client findByPhoneNumber(Long phoneNumber);
	
	Optional<Client> findByIdAndPassword(String id, String password);

}
