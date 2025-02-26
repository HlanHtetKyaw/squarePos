package com.hlan.squarePos.product.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hlan.squarePos.product.domain.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
