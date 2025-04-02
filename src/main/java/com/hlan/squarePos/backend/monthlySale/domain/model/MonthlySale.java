package com.hlan.squarePos.backend.monthlySale.domain.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MonthlySale {
	@Id
	private long id;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int totalCost;
	private int totalSale;
	private int profit;
}
