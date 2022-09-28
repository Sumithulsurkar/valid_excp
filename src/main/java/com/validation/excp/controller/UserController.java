package com.validation.excp.controller;

import com.validation.excp.dto.UserRequest;
import com.validation.excp.entity.User;
import com.validation.excp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * http://localhost:8080/users/signup
     * @param userRequest
     * @return
     */
    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    /**
     * http://localhost:8080/users/fetchAllUser
     * @return
     */

    @GetMapping("/fetchAllUser")
    public ResponseEntity<List<User>> getUserData(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    /**
     * http://localhost:8080/users/4
     * @param id
     * @return
     */

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }


}
