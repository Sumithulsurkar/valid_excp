package com.validation.excp.services;

import com.validation.excp.dto.UserRequest;
import com.validation.excp.entity.User;
import com.validation.excp.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(UserRequest userRequest){

        User user = new User(0, userRequest.getName(), userRequest.getEmail(),
                userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUserById(int id){
        return userRepo.findById(id).orElse(null);
    }
}
