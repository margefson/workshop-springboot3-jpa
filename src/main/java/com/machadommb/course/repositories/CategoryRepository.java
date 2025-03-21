package com.machadommb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machadommb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
