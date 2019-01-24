package com.cignex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cignex.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findById(int id);
}
