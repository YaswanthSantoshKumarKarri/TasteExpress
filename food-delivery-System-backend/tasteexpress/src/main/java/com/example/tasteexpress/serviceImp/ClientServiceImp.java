package com.example.tasteexpress.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tasteexpress.entity.Client;
import com.example.tasteexpress.repos.ClientRepo;
import com.example.tasteexpress.service.ClientService;

@Service
public class ClientServiceImp implements ClientService {

	@Autowired
	private ClientRepo clientRepo;
	
	@Override
	public String createClient(Client clientData) {
		System.out.println(clientData.getId()+"  "+clientRepo.findById(clientData.getId()));
		if((clientRepo.findById(clientData.getId()).isEmpty())) {
			System.out.println("clientId Inside");
			if((clientRepo.findByEmailId(clientData.getEmailId())==null)) {
				System.out.println("email Inside");
				if( (clientRepo.findByPhoneNumber(clientData.getPhoneNumber())==null)) {
					System.out.println("mobile number Inside");
					clientRepo.save(clientData);
					return "Registration is successful";
				}else {
					System.out.println("AAccount on this Phone number already exists!");
					return "Account on this Phone number already exists!";
				}
			}else {
				System.out.println("Account on this Email Id already exists!");
				return "Account on this Email Id already exists!";
			}
			
		}else {
			System.out.println("Account on this Client Id already exists!");
			return "Account on this Client Id already exists!";
		}
	}

	@Override
	public Optional<Client> getByIdPass(String Id, String password) {
		// TODO Auto-generated method stub
		return clientRepo.findByIdAndPassword(Id,password);
	}
}
