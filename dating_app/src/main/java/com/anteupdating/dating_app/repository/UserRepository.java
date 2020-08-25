package com.anteupdating.dating_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anteupdating.dating_app.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

