package com.machadommb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machadommb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
