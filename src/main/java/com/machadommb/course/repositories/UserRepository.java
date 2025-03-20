package com.machadommb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machadommb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
