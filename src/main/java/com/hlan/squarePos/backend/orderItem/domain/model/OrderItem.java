package com.hlan.squarePos.backend.orderItem.domain.model;

import org.springframework.stereotype.Component;

import com.hlan.squarePos.backend.product.domain.model.Product;
import com.hlan.squarePos.backend.voucher.domain.model.Voucher;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "voucherId")
	private Voucher voucher;
	private int cost;
	private int sale;
	private int quantity;
}
