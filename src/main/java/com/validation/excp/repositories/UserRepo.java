package com.validation.excp.repositories;

import com.validation.excp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> { // Integer -> Data Type of your PK
}
