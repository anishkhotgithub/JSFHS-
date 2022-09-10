package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface UserRepository extends JpaRepository<User, Integer> 
{
	User findByUserid(int userid);
	User findByUsername(String username);
}
