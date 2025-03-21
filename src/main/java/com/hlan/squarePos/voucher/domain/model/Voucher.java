package com.hlan.squarePos.voucher.domain.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hlan.squarePos.orderItem.domain.model.OrderItem;

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
	private long id;
	
	@Column(nullable = false,updatable = false)
	private LocalDate date;
	
	@Column(nullable = false,updatable = false)
	LocalTime hour;
	
	private int total_cost;
	private int total_sale;
	private int profit;
	
	@OneToMany(mappedBy = "voucher")
	private List<OrderItem> orderItem;
	
	@PrePersist
	protected void onCreate() {
		date = LocalDate.now();
		hour = LocalTime.now();
	}
}
