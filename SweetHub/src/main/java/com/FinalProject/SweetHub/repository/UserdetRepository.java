package com.FinalProject.SweetHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FinalProject.SweetHub.model.Userdet;

public interface UserdetRepository extends JpaRepository<Userdet,Integer>{

	Userdet findByUsername(String username);
}
