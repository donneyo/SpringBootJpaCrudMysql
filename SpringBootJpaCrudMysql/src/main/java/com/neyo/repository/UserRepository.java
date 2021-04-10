package com.neyo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neyo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}