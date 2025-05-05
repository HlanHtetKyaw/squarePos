package com.hlan.squarePos.backend.product.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hlan.squarePos.backend.product.domain.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
