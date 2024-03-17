package com.example.hybridencryption.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.hybridencryption.entity.UserRegistration;

public interface UserRegistrationRepository  extends CrudRepository<UserRegistration, Integer> {
    
    UserRegistration findById(int id);

    UserRegistration findByUsername(String username);
    
    UserRegistration findByEmail(String email);

    UserRegistration findByUsernameAndPassword(String username,String password);
    
}
