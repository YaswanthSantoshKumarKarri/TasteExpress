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
@Table(name="client")
public class Client {
	
	@Id
	private String id;
	private String name;
	private String emailId;
	private Long phoneNumber;
	private String address;
	private String password;
}
