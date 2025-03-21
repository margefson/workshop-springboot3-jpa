package com.machadommb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machadommb.course.entities.OrderItem;
import com.machadommb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
