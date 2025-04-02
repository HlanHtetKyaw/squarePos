package com.hlan.squarePos.backend.dailySale.domain.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class DailySale {
	@Id
	private long id;
	private LocalDate date;
	private int totalCost;
	private int totalSale;
	private int profit;
}
