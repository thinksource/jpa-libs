package com.lb.datajpa.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lb.datajpa.user.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

    User findByNameAndEmail(
                @Param("name") String name,
                @Param("email") String email
            );

}
