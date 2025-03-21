package com.hlan.squarePos.orderItem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hlan.squarePos.orderItem.domain.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
