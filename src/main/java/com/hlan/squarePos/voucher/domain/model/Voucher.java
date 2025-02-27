package com.hlan.squarePos.voucher.domain.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hlan.squarePos.product.domain.model.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Voucher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(nullable = false,updatable = false)
	LocalDate date;
	
	@Column(nullable = false,updatable = false)
	LocalTime hour;
	
	int total_cost;
	int total_sale;
	int profit;
	
	@OneToMany
	@JoinColumn(name = "product_id")
	List<Product> product;
	
	@PrePersist
	protected void onCreate() {
		date = LocalDate.now();
		hour = LocalTime.now();
	}
}
