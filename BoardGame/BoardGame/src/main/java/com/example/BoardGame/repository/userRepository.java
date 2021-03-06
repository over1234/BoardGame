package com.example.BoardGame.repository;

import com.example.BoardGame.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface userRepository extends JpaRepository <User,Long> {//<Entitiy, id유형>


    @Query(value = "select * from user where email = :email and password = :password", nativeQuery = true)
    User findUser(String email, String password);
}
