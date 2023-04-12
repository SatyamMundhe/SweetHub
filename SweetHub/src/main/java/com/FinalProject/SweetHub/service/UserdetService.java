package com.FinalProject.SweetHub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FinalProject.SweetHub.model.Userdet;
import com.FinalProject.SweetHub.repository.UserdetRepository;

@Service
public class UserdetService {
	
	@Autowired
	UserdetRepository userdetRepository;
	
	public List<Userdet> getAllUserdet(){
		return userdetRepository.findAll()
;	}
	
	public void addUserdet(Userdet userdet) {
		userdetRepository.save(userdet);
	}
	public void removeUserdetById(int id) {
		userdetRepository.deleteById(id);
	}
	public Optional<Userdet> getUserdetById(int id) {
		return(userdetRepository.findById(id));
	}
	public Userdet getUserdetByUsername(String username) {
		return(userdetRepository.findByUsername(username));
	}



}
