package com.mycompany.myapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.myapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
